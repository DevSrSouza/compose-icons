package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoPhotography: ImageVector
    get() {
        if (_noPhotography != null) {
            return _noPhotography!!
        }
        _noPhotography = Builder(name = "NoPhotography", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.94f, 8.12f)
                lineTo(7.48f, 4.66f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(1.83f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(14.17f)
                lineToRelative(-5.12f, -5.12f)
                curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(18.17f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(0.17f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineTo(21.0f, 21.0f)
                lineToRelative(0.9f, 0.9f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(14.49f, 17.32f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(12.67f, 15.92f, 12.35f, 16.0f, 12.0f, 16.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(7.25f, 11.24f, 7.0f, 12.09f, 7.0f, 13.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveTo(12.91f, 18.0f, 13.76f, 17.75f, 14.49f, 17.32f)
                close()
            }
        }
        .build()
        return _noPhotography!!
    }

private var _noPhotography: ImageVector? = null
