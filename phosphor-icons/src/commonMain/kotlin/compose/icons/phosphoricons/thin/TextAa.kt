package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.5f, 54.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.0f, 0.0f)
                lineToRelative(-72.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, 3.8f)
                lineTo(31.6f, 156.0f)
                horizontalLineToRelative(96.8f)
                lineToRelative(20.1f, 37.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 196.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 1.9f, -0.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.6f, -5.4f)
                close()
                moveTo(35.8f, 148.0f)
                lineTo(80.0f, 64.5f)
                lineTo(124.2f, 148.0f)
                close()
                moveTo(208.0f, 98.9f)
                arcToRelative(38.4f, 38.4f, 0.0f, false, false, -26.8f, 10.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                curveToRelative(5.3f, -5.3f, 13.1f, -8.3f, 21.2f, -8.3f)
                curveToRelative(15.4f, 0.0f, 28.0f, 10.8f, 28.0f, 24.0f)
                verticalLineToRelative(15.9f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -28.0f, -11.9f)
                curveToRelative(-19.9f, 0.0f, -36.0f, 14.4f, -36.0f, 32.0f)
                reflectiveCurveToRelative(16.1f, 32.0f, 36.0f, 32.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 236.0f, 187.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(244.0f, 130.9f)
                curveTo(244.0f, 113.3f, 227.9f, 98.9f, 208.0f, 98.9f)
                close()
                moveTo(208.0f, 190.9f)
                curveToRelative(-15.4f, 0.0f, -28.0f, -10.8f, -28.0f, -24.0f)
                reflectiveCurveToRelative(12.6f, -24.0f, 28.0f, -24.0f)
                reflectiveCurveToRelative(28.0f, 10.8f, 28.0f, 24.0f)
                reflectiveCurveTo(223.4f, 190.9f, 208.0f, 190.9f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
