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

public val BrandsGroup.Sistrix: ImageVector
    get() {
        if (_sistrix != null) {
            return _sistrix!!
        }
        _sistrix = Builder(name = "Sistrix", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 449.0f)
                lineTo(301.2f, 300.2f)
                curveToRelative(20.0f, -27.9f, 31.9f, -62.2f, 31.9f, -99.2f)
                curveToRelative(0.0f, -93.1f, -74.7f, -168.9f, -166.5f, -168.9f)
                curveTo(74.7f, 32.0f, 0.0f, 107.8f, 0.0f, 200.9f)
                reflectiveCurveToRelative(74.7f, 168.9f, 166.5f, 168.9f)
                curveToRelative(39.8f, 0.0f, 76.3f, -14.2f, 105.0f, -37.9f)
                lineToRelative(146.0f, 148.1f)
                lineToRelative(30.5f, -31.0f)
                close()
                moveTo(166.5f, 330.8f)
                curveToRelative(-70.6f, 0.0f, -128.1f, -58.3f, -128.1f, -129.9f)
                reflectiveCurveTo(95.9f, 71.0f, 166.5f, 71.0f)
                reflectiveCurveToRelative(128.1f, 58.3f, 128.1f, 129.9f)
                reflectiveCurveToRelative(-57.4f, 129.9f, -128.1f, 129.9f)
                close()
            }
        }
        .build()
        return _sistrix!!
    }

private var _sistrix: ImageVector? = null
