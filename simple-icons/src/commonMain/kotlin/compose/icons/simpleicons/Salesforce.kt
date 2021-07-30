package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Salesforce: ImageVector
    get() {
        if (_salesforce != null) {
            return _salesforce!!
        }
        _salesforce = Builder(name = "Salesforce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.006f, 5.415f)
                arcToRelative(4.195f, 4.195f, 0.0f, false, true, 3.045f, -1.306f)
                curveToRelative(1.56f, 0.0f, 2.954f, 0.9f, 3.69f, 2.205f)
                curveToRelative(0.63f, -0.3f, 1.35f, -0.45f, 2.1f, -0.45f)
                curveToRelative(2.85f, 0.0f, 5.159f, 2.34f, 5.159f, 5.22f)
                reflectiveCurveToRelative(-2.31f, 5.22f, -5.176f, 5.22f)
                curveToRelative(-0.345f, 0.0f, -0.69f, -0.044f, -1.02f, -0.104f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.3f, 1.95f)
                curveToRelative(-0.6f, 0.0f, -1.155f, -0.15f, -1.65f, -0.375f)
                arcTo(4.314f, 4.314f, 0.0f, false, true, 8.88f, 20.4f)
                arcToRelative(4.302f, 4.302f, 0.0f, false, true, -4.05f, -2.82f)
                curveToRelative(-0.27f, 0.062f, -0.54f, 0.076f, -0.825f, 0.076f)
                curveToRelative(-2.204f, 0.0f, -4.005f, -1.8f, -4.005f, -4.05f)
                curveToRelative(0.0f, -1.5f, 0.811f, -2.805f, 2.01f, -3.51f)
                curveToRelative(-0.255f, -0.57f, -0.39f, -1.2f, -0.39f, -1.846f)
                curveToRelative(0.0f, -2.58f, 2.1f, -4.65f, 4.65f, -4.65f)
                curveToRelative(1.53f, 0.0f, 2.85f, 0.705f, 3.72f, 1.8f)
            }
        }
        .build()
        return _salesforce!!
    }

private var _salesforce: ImageVector? = null
