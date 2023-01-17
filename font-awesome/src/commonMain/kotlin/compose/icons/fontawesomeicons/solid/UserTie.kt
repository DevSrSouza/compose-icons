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

public val SolidGroup.UserTie: ImageVector
    get() {
        if (_userTie != null) {
            return _userTie!!
        }
        _userTie = Builder(name = "UserTie", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.3f, 128.0f, -128.0f, 128.0f)
                reflectiveCurveToRelative(-128.0f, -57.3f, -128.0f, -128.0f)
                reflectiveCurveTo(153.3f, 0.0f, 224.0f, 0.0f)
                close()
                moveTo(209.1f, 359.2f)
                lineToRelative(-18.6f, -31.0f)
                curveToRelative(-6.4f, -10.7f, 1.3f, -24.2f, 13.7f, -24.2f)
                horizontalLineTo(224.0f)
                horizontalLineToRelative(19.7f)
                curveToRelative(12.4f, 0.0f, 20.1f, 13.6f, 13.7f, 24.2f)
                lineToRelative(-18.6f, 31.0f)
                lineToRelative(33.4f, 123.9f)
                lineToRelative(39.5f, -161.2f)
                curveToRelative(77.2f, 12.0f, 136.3f, 78.8f, 136.3f, 159.4f)
                curveToRelative(0.0f, 17.0f, -13.8f, 30.7f, -30.7f, 30.7f)
                horizontalLineTo(265.1f)
                horizontalLineTo(182.9f)
                horizontalLineTo(30.7f)
                curveTo(13.8f, 512.0f, 0.0f, 498.2f, 0.0f, 481.3f)
                curveToRelative(0.0f, -80.6f, 59.1f, -147.4f, 136.3f, -159.4f)
                lineToRelative(39.5f, 161.2f)
                lineToRelative(33.4f, -123.9f)
                close()
            }
        }
        .build()
        return _userTie!!
    }

private var _userTie: ImageVector? = null
