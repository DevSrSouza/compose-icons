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

public val SolidGroup.ShareAltSquare: ImageVector
    get() {
        if (_shareAltSquare != null) {
            return _shareAltSquare!!
        }
        _shareAltSquare = Builder(name = "ShareAltSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(304.0f, 296.0f)
                curveToRelative(-14.562f, 0.0f, -27.823f, 5.561f, -37.783f, 14.671f)
                lineToRelative(-67.958f, -40.775f)
                arcToRelative(56.339f, 56.339f, 0.0f, false, false, 0.0f, -27.793f)
                lineToRelative(67.958f, -40.775f)
                curveTo(276.177f, 210.439f, 289.438f, 216.0f, 304.0f, 216.0f)
                curveToRelative(30.928f, 0.0f, 56.0f, -25.072f, 56.0f, -56.0f)
                reflectiveCurveToRelative(-25.072f, -56.0f, -56.0f, -56.0f)
                reflectiveCurveToRelative(-56.0f, 25.072f, -56.0f, 56.0f)
                curveToRelative(0.0f, 4.797f, 0.605f, 9.453f, 1.74f, 13.897f)
                lineToRelative(-67.958f, 40.775f)
                curveTo(171.823f, 205.561f, 158.562f, 200.0f, 144.0f, 200.0f)
                curveToRelative(-30.928f, 0.0f, -56.0f, 25.072f, -56.0f, 56.0f)
                reflectiveCurveToRelative(25.072f, 56.0f, 56.0f, 56.0f)
                curveToRelative(14.562f, 0.0f, 27.823f, -5.561f, 37.783f, -14.671f)
                lineToRelative(67.958f, 40.775f)
                arcToRelative(56.088f, 56.088f, 0.0f, false, false, -1.74f, 13.897f)
                curveToRelative(0.0f, 30.928f, 25.072f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.072f, 56.0f, -56.0f)
                curveTo(360.0f, 321.072f, 334.928f, 296.0f, 304.0f, 296.0f)
                close()
            }
        }
        .build()
        return _shareAltSquare!!
    }

private var _shareAltSquare: ImageVector? = null
