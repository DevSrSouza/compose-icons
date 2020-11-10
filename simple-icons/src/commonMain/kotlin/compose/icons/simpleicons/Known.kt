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

public val SimpleIcons.Known: VectorAsset
    get() {
        if (_known != null) {
            return _known!!
        }
        _known = VectorAssetBuilder(name = "Known", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.6f, 0.0f, 12.0f)
                reflectiveCurveTo(5.4f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.4f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 1.8f)
                curveTo(6.3f, 1.8f, 1.8f, 6.3f, 1.8f, 12.0f)
                reflectiveCurveTo(6.3f, 22.2f, 12.0f, 22.2f)
                reflectiveCurveTo(22.2f, 17.7f, 22.2f, 12.0f)
                reflectiveCurveTo(17.7f, 1.8f, 12.0f, 1.8f)
                close()
                moveTo(17.6f, 7.2f)
                lineToRelative(-0.2f, 0.2f)
                curveToRelative(0.1f, -0.1f, 0.3f, -0.2f, 0.4f, -0.2f)
                horizontalLineToRelative(-0.2f)
                close()
                moveTo(17.8f, 7.2f)
                horizontalLineToRelative(0.5f)
                lineTo(18.3f, 5.3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.2f, 0.0f, 0.3f, 0.1f, 0.3f, 0.3f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.2f, -0.1f, 0.2f)
                lineToRelative(-3.8f, 3.8f)
                lineTo(10.0f, 11.5f)
                curveToRelative(-0.1f, 0.0f, -0.2f, -0.1f, -0.2f, -0.2f)
                lineTo(9.8f, 7.9f)
                curveToRelative(0.0f, -0.4f, 0.3f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(0.8f)
                lineTo(11.3f, 5.3f)
                lineTo(5.4f, 5.3f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.4f, 0.0f, 0.7f, 0.3f, 0.7f, 0.7f)
                verticalLineToRelative(8.4f)
                curveToRelative(0.0f, 0.4f, -0.3f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.7f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.9f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(-0.4f, 0.0f, -0.7f, -0.3f, -0.7f, -0.7f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, 0.1f, -0.3f)
                lineToRelative(1.5f, -1.5f)
                reflectiveCurveToRelative(0.1f, -0.1f, 0.2f, -0.1f)
                reflectiveCurveToRelative(0.2f, 0.0f, 0.2f, 0.1f)
                lineToRelative(2.1f, 3.3f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.3f, 0.3f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(2.0f)
                lineTo(19.0f, 18.9f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.1f, -0.5f, -0.3f)
                verticalLineToRelative(-0.1f)
                lineTo(14.1f, 11.0f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                reflectiveCurveToRelative(0.0f, -0.2f, 0.1f, -0.2f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.2f, -0.2f, 0.3f, -0.2f, 0.5f, -0.2f)
                close()
            }
        }
        .build()
        return _known!!
    }

private var _known: VectorAsset? = null
