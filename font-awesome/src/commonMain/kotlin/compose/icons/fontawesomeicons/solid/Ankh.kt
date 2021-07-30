package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Ankh: ImageVector
    get() {
        if (_ankh != null) {
            return _ankh!!
        }
        _ankh = Builder(name = "Ankh", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 256.0f)
                horizontalLineToRelative(-44.62f)
                curveTo(272.46f, 222.01f, 288.0f, 181.65f, 288.0f, 144.0f)
                curveTo(288.0f, 55.63f, 230.69f, 0.0f, 160.0f, 0.0f)
                reflectiveCurveTo(32.0f, 55.63f, 32.0f, 144.0f)
                curveToRelative(0.0f, 37.65f, 15.54f, 78.01f, 36.62f, 112.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(152.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineTo(336.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(160.0f, 80.0f)
                curveToRelative(29.61f, 0.0f, 48.0f, 24.52f, 48.0f, 64.0f)
                curveToRelative(0.0f, 34.66f, -27.14f, 78.14f, -48.0f, 100.87f)
                curveToRelative(-20.86f, -22.72f, -48.0f, -66.21f, -48.0f, -100.87f)
                curveToRelative(0.0f, -39.48f, 18.39f, -64.0f, 48.0f, -64.0f)
                close()
            }
        }
        .build()
        return _ankh!!
    }

private var _ankh: ImageVector? = null
