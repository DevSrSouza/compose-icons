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

public val SimpleIcons.Kentico: VectorAsset
    get() {
        if (_kentico != null) {
            return _kentico!!
        }
        _kentico = VectorAssetBuilder(name = "Kentico", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(25.0f)
                lineTo(25.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(14.5f, 8.8f)
                lineToRelative(3.0f, -3.0f)
                reflectiveCurveToRelative(2.2f, 1.3f, 0.9f, 2.6f)
                lineToRelative(-2.1f, 2.1f)
                curveToRelative(-1.2f, 1.1f, -2.9f, -0.6f, -1.8f, -1.7f)
                close()
                moveTo(13.7f, 5.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.5f, -2.5f, 1.5f, -2.5f, 0.0f)
                lineTo(11.2f, 4.3f)
                reflectiveCurveToRelative(2.5f, -0.6f, 2.5f, 1.2f)
                close()
                moveTo(8.4f, 6.7f)
                lineToRelative(2.1f, 2.1f)
                curveToRelative(1.1f, 1.1f, -0.6f, 2.8f, -1.7f, 1.7f)
                lineToRelative(-3.0f, -3.0f)
                reflectiveCurveToRelative(1.3f, -2.1f, 2.6f, -0.8f)
                close()
                moveTo(5.5f, 11.3f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.5f, 0.0f, 1.5f, 2.5f, 0.0f, 2.5f)
                lineTo(4.3f, 13.8f)
                curveToRelative(0.0f, -0.1f, -0.6f, -2.5f, 1.2f, -2.5f)
                close()
                moveTo(10.5f, 16.2f)
                lineToRelative(-3.0f, 3.0f)
                reflectiveCurveToRelative(-2.2f, -1.3f, -0.9f, -2.6f)
                lineToRelative(2.1f, -2.1f)
                curveToRelative(1.2f, -1.1f, 2.9f, 0.6f, 1.8f, 1.7f)
                close()
                moveTo(13.7f, 20.7f)
                reflectiveCurveToRelative(-2.5f, 0.6f, -2.5f, -1.2f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.5f, 2.5f, -1.5f, 2.5f, 0.0f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(12.5f, 14.3f)
                curveToRelative(-1.0f, 0.0f, -1.8f, -0.8f, -1.8f, -1.8f)
                reflectiveCurveToRelative(0.8f, -1.8f, 1.8f, -1.8f)
                reflectiveCurveToRelative(1.8f, 0.8f, 1.8f, 1.8f)
                reflectiveCurveToRelative(-0.8f, 1.8f, -1.8f, 1.8f)
                close()
                moveTo(16.6f, 18.3f)
                lineToRelative(-2.1f, -2.1f)
                curveToRelative(-1.1f, -1.1f, 0.6f, -2.8f, 1.7f, -1.7f)
                lineToRelative(3.0f, 3.0f)
                reflectiveCurveToRelative(-1.3f, 2.1f, -2.6f, 0.8f)
                close()
                moveTo(19.5f, 13.7f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.5f, 0.0f, -1.5f, -2.5f, 0.0f, -2.5f)
                horizontalLineToRelative(4.2f)
                curveToRelative(0.0f, 0.1f, 0.6f, 2.5f, -1.2f, 2.5f)
                close()
            }
        }
        .build()
        return _kentico!!
    }

private var _kentico: VectorAsset? = null
