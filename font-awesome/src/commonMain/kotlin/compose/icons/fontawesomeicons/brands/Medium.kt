package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(name = "Medium", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.5f, 74.262f)
                curveTo(80.813f, 74.262f, 0.0f, 155.633f, 0.0f, 256.0f)
                reflectiveCurveTo(80.819f, 437.738f, 180.5f, 437.738f)
                reflectiveCurveTo(361.0f, 356.373f, 361.0f, 256.0f)
                reflectiveCurveTo(280.191f, 74.262f, 180.5f, 74.262f)
                close()
                moveTo(468.75f, 84.908f)
                curveToRelative(-49.845f, 0.0f, -90.245f, 76.619f, -90.245f, 171.095f)
                reflectiveCurveToRelative(40.406f, 171.1f, 90.251f, 171.1f)
                reflectiveCurveToRelative(90.251f, -76.619f, 90.251f, -171.1f)
                lineTo(559.0f, 256.003f)
                curveTo(559.0f, 161.5f, 518.6f, 84.908f, 468.752f, 84.908f)
                close()
                moveTo(608.256f, 102.729f)
                curveToRelative(-17.526f, 0.0f, -31.735f, 68.628f, -31.735f, 153.274f)
                reflectiveCurveToRelative(14.2f, 153.274f, 31.735f, 153.274f)
                reflectiveCurveTo(640.0f, 340.631f, 640.0f, 256.0f)
                curveTo(640.0f, 171.351f, 625.785f, 102.729f, 608.258f, 102.729f)
                close()
            }
        }
        .build()
        return _medium!!
    }

private var _medium: ImageVector? = null
