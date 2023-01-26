package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Unarchive: ImageVector
    get() {
        if (_unarchive != null) {
            return _unarchive!!
        }
        _unarchive = Builder(name = "Unarchive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.55f, 5.22f)
                lineToRelative(-1.39f, -1.68f)
                curveTo(18.88f, 3.21f, 18.47f, 3.0f, 18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                curveToRelative(-0.47f, 0.0f, -0.88f, 0.21f, -1.15f, 0.55f)
                lineTo(3.46f, 5.22f)
                curveTo(3.17f, 5.57f, 3.0f, 6.01f, 3.0f, 6.5f)
                lineTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 6.5f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.93f, -0.45f, -1.28f)
                close()
                moveTo(12.35f, 9.85f)
                lineTo(17.5f, 15.0f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.5f, 15.0f)
                lineToRelative(5.15f, -5.15f)
                curveToRelative(0.19f, -0.19f, 0.51f, -0.19f, 0.7f, 0.0f)
                close()
                moveTo(5.12f, 5.0f)
                lineToRelative(0.82f, -1.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(0.93f, 1.0f)
                lineTo(5.12f, 5.0f)
                close()
            }
        }
        .build()
        return _unarchive!!
    }

private var _unarchive: ImageVector? = null
