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

public val SimpleIcons.Toggl: VectorAsset
    get() {
        if (_toggl != null) {
            return _toggl!!
        }
        _toggl = VectorAssetBuilder(name = "Toggl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.37f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                reflectiveCurveTo(18.63f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.16f, 4.67f)
                horizontalLineToRelative(1.68f)
                verticalLineToRelative(8.36f)
                horizontalLineToRelative(-1.68f)
                lineTo(11.16f, 4.67f)
                close()
                moveTo(12.0f, 18.155f)
                curveToRelative(-3.24f, -0.002f, -5.865f, -2.63f, -5.864f, -5.868f)
                curveToRelative(0.0f, -2.64f, 1.767f, -4.956f, 4.314f, -5.655f)
                verticalLineToRelative(1.71f)
                curveToRelative(-1.628f, 0.64f, -2.698f, 2.21f, -2.695f, 3.96f)
                curveToRelative(0.0f, 2.345f, 1.903f, 4.244f, 4.248f, 4.243f)
                curveToRelative(2.344f, -0.002f, 4.244f, -1.903f, 4.243f, -4.248f)
                curveToRelative(0.0f, -1.745f, -1.07f, -3.312f, -2.694f, -3.95f)
                lineTo(13.552f, 6.63f)
                curveToRelative(2.55f, 0.7f, 4.314f, 3.018f, 4.314f, 5.66f)
                curveToRelative(0.0f, 3.24f, -2.626f, 5.864f, -5.865f, 5.864f)
                close()
            }
        }
        .build()
        return _toggl!!
    }

private var _toggl: VectorAsset? = null
