package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Read24: ImageVector
    get() {
        if (_read24 != null) {
            return _read24!!
        }
        _read24 = Builder(name = "Read24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.89f, 1.767f)
                arcToRelative(2.252f, 2.252f, 0.0f, false, true, 2.22f, 0.0f)
                lineToRelative(9.75f, 5.525f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 24.0f, 9.249f)
                verticalLineToRelative(9.501f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 21.75f, 21.0f)
                lineTo(2.25f, 21.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 0.0f, 18.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.81f, 0.435f, -1.558f, 1.14f, -1.958f)
                close()
                moveTo(12.37f, 3.072f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, 0.0f)
                lineToRelative(-9.316f, 5.28f)
                lineToRelative(7.41f, 4.233f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 4.553f, 0.0f)
                lineToRelative(7.41f, -4.234f)
                lineToRelative(-9.317f, -5.28f)
                close()
                moveTo(20.65f, 19.5f)
                lineToRelative(-7.26f, -5.704f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.78f, 0.0f)
                lineTo(3.35f, 19.5f)
                close()
                moveTo(22.5f, 9.614f)
                lineTo(15.55f, 13.585f)
                lineTo(22.213f, 18.821f)
                curveToRelative(0.089f, 0.07f, 0.161f, 0.159f, 0.21f, 0.26f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, 0.077f, -0.331f)
                close()
                moveTo(8.45f, 13.585f)
                lineTo(1.5f, 9.614f)
                verticalLineToRelative(9.136f)
                curveToRelative(0.0f, 0.119f, 0.028f, 0.23f, 0.076f, 0.33f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.21f, -0.259f)
                close()
            }
        }
        .build()
        return _read24!!
    }

private var _read24: ImageVector? = null
