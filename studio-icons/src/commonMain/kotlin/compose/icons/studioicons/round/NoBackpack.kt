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

public val RoundGroup.NoBackpack: ImageVector
    get() {
        if (_noBackpack != null) {
            return _noBackpack!!
        }
        _noBackpack = Builder(name = "NoBackpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.98f, 4.15f)
                curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f)
                verticalLineTo(3.5f)
                curveTo(7.0f, 2.67f, 7.67f, 2.0f, 8.5f, 2.0f)
                reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(3.5f)
                curveTo(14.0f, 2.67f, 14.67f, 2.0f, 15.5f, 2.0f)
                reflectiveCurveTo(17.0f, 2.67f, 17.0f, 3.5f)
                verticalLineToRelative(0.64f)
                curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f)
                verticalLineToRelative(9.17f)
                lineToRelative(-2.03f, -2.03f)
                curveTo(17.98f, 15.09f, 18.0f, 15.05f, 18.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.17f)
                lineTo(6.98f, 4.15f)
                close()
                moveTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-0.14f, -0.14f)
                curveTo(18.65f, 21.91f, 18.34f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(11.17f, 14.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(11.17f)
                close()
            }
        }
        .build()
        return _noBackpack!!
    }

private var _noBackpack: ImageVector? = null
