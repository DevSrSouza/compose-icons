package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xcode: VectorAsset
    get() {
        if (_xcode != null) {
            return _xcode!!
        }
        _xcode = VectorAssetBuilder(name = "Xcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.8f)
                curveToRelative(0.4f, -0.2f, 0.6f, -0.4f, 0.9f, -0.4f)
                curveToRelative(0.5f, 0.0f, 0.8f, 0.3f, 0.9f, 0.5f)
                curveToRelative(0.2f, 0.3f, 0.9f, 0.5f, 1.2f, 0.5f)
                curveToRelative(0.2f, 0.0f, 0.5f, -0.7f, 0.7f, -1.3f)
                reflectiveCurveToRelative(0.2f, -1.3f, 0.1f, -1.4f)
                curveToRelative(-0.1f, -0.1f, -0.9f, -0.3f, -1.1f, -0.3f)
                curveToRelative(-0.1f, 0.1f, -0.3f, 0.2f, -0.7f, 0.2f)
                reflectiveCurveToRelative(-0.8f, -0.3f, -1.1f, -0.6f)
                curveToRelative(-0.5f, -0.5f, -1.1f, -0.7f, -1.7f, -0.9f)
                curveToRelative(-0.6f, -0.2f, -1.3f, -0.2f, -1.9f, -0.2f)
                curveToRelative(-0.9f, -0.1f, -1.9f, -0.1f, -2.8f, 0.2f)
                curveToRelative(-0.4f, 0.1f, -0.7f, 0.2f, -1.1f, 0.4f)
                curveToRelative(-0.1f, 0.1f, -0.4f, 0.2f, -0.5f, 0.2f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, 0.0f, 0.2f)
                reflectiveCurveToRelative(0.5f, -0.1f, 0.5f, -0.1f)
                reflectiveCurveToRelative(-0.5f, 0.2f, -0.5f, 0.4f)
                curveToRelative(0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f)
                reflectiveCurveToRelative(0.3f, -0.1f, 0.5f, -0.1f)
                curveToRelative(0.4f, 0.0f, 1.0f, -0.2f, 1.5f, -0.2f)
                curveToRelative(0.6f, 0.0f, 1.2f, 0.2f, 1.8f, 0.8f)
                curveToRelative(0.9f, 1.1f, 0.8f, 2.5f, 0.8f, 2.8f)
                curveToRelative(-0.2f, 2.1f, -4.9f, 14.9f, -5.1f, 15.8f)
                curveToRelative(-0.2f, 0.9f, -0.2f, 1.4f, 0.9f, 1.7f)
                reflectiveCurveToRelative(1.5f, 0.0f, 1.7f, -0.4f)
                curveToRelative(0.1f, -0.7f, 3.1f, -16.5f, 4.9f, -17.9f)
                close()
                moveTo(16.1f, 3.8f)
                lineTo(0.0f, 6.3f)
                lineTo(2.6f, 23.0f)
                lineToRelative(8.6f, -1.4f)
                curveToRelative(-0.1f, -0.7f, 2.2f, -6.7f, 2.6f, -7.8f)
                lineToRelative(-4.4f, 0.7f)
                lineToRelative(0.6f, -1.8f)
                lineToRelative(3.1f, -0.5f)
                lineToRelative(0.8f, 1.0f)
                reflectiveCurveToRelative(0.2f, -0.5f, 0.2f, -0.7f)
                lineTo(9.8f, 7.2f)
                curveToRelative(-0.2f, -0.3f, -0.2f, -0.7f, 0.1f, -0.9f)
                lineToRelative(0.2f, -0.2f)
                curveToRelative(0.3f, -0.2f, 0.7f, -0.2f, 0.9f, 0.1f)
                lineToRelative(3.8f, 4.4f)
                curveToRelative(0.8f, -2.4f, 1.5f, -4.5f, 1.5f, -5.2f)
                curveToRelative(0.1f, -0.2f, 0.1f, -0.9f, -0.2f, -1.6f)
                close()
                moveTo(4.1f, 13.7f)
                lineToRelative(2.7f, -0.5f)
                lineToRelative(-0.7f, 1.8f)
                lineToRelative(-1.8f, 0.3f)
                lineToRelative(-0.2f, -1.6f)
                close()
                moveTo(9.9f, 8.6f)
                lineToRelative(0.3f, 0.1f)
                curveToRelative(0.4f, 0.1f, 0.5f, 0.5f, 0.4f, 0.9f)
                lineToRelative(-3.0f, 8.0f)
                lineTo(5.8f, 20.0f)
                lineToRelative(0.2f, -3.0f)
                lineToRelative(3.0f, -8.0f)
                curveToRelative(0.1f, -0.4f, 0.5f, -0.5f, 0.9f, -0.4f)
                close()
                moveTo(20.7f, 5.8f)
                curveToRelative(-0.4f, 0.4f, -0.9f, 1.7f, -1.9f, 5.5f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.3f, 1.6f)
                lineToRelative(-0.8f, 0.1f)
                curveToRelative(-0.1f, 0.5f, -0.2f, 1.0f, -0.4f, 1.6f)
                curveToRelative(1.7f, 0.9f, 0.8f, 3.1f, 0.7f, 3.1f)
                curveToRelative(-0.1f, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f)
                reflectiveCurveToRelative(0.1f, -0.4f, -0.2f, -0.5f)
                curveToRelative(-0.2f, -0.1f, -0.6f, -0.2f, -0.9f, -0.4f)
                curveToRelative(-0.3f, 1.2f, -0.6f, 2.6f, -0.9f, 4.1f)
                lineToRelative(6.3f, -1.0f)
                lineToRelative(-2.1f, -14.1f)
                lineToRelative(-0.1f, 0.1f)
                close()
            }
        }
        .build()
        return _xcode!!
    }

private var _xcode: VectorAsset? = null
