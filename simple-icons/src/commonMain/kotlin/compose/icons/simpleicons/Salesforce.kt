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

public val SimpleIcons.Salesforce: VectorAsset
    get() {
        if (_salesforce != null) {
            return _salesforce!!
        }
        _salesforce = VectorAssetBuilder(name = "Salesforce", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.005f, 5.416f)
                curveToRelative(0.75f, -0.796f, 1.845f, -1.306f, 3.046f, -1.306f)
                curveToRelative(1.56f, 0.0f, 2.954f, 0.9f, 3.689f, 2.205f)
                curveToRelative(0.63f, -0.3f, 1.35f, -0.45f, 2.101f, -0.45f)
                curveToRelative(2.849f, 0.0f, 5.159f, 2.34f, 5.159f, 5.22f)
                reflectiveCurveToRelative(-2.311f, 5.22f, -5.176f, 5.22f)
                curveToRelative(-0.345f, 0.0f, -0.689f, -0.044f, -1.02f, -0.104f)
                curveToRelative(-0.645f, 1.17f, -1.875f, 1.95f, -3.3f, 1.95f)
                curveToRelative(-0.6f, 0.0f, -1.155f, -0.15f, -1.65f, -0.375f)
                curveToRelative(-0.659f, 1.546f, -2.189f, 2.624f, -3.975f, 2.624f)
                curveToRelative(-1.859f, 0.0f, -3.45f, -1.169f, -4.05f, -2.819f)
                curveToRelative(-0.27f, 0.061f, -0.54f, 0.075f, -0.825f, 0.075f)
                curveToRelative(-2.204f, 0.0f, -4.005f, -1.8f, -4.005f, -4.05f)
                curveToRelative(0.0f, -1.5f, 0.811f, -2.805f, 2.01f, -3.51f)
                curveToRelative(-0.255f, -0.57f, -0.39f, -1.2f, -0.39f, -1.846f)
                curveToRelative(0.0f, -2.58f, 2.1f, -4.649f, 4.65f, -4.649f)
                curveToRelative(1.53f, 0.0f, 2.85f, 0.704f, 3.72f, 1.8f)
            }
        }
        .build()
        return _salesforce!!
    }

private var _salesforce: VectorAsset? = null
