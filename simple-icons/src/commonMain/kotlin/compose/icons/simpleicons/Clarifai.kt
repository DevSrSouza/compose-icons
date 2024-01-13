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

public val SimpleIcons.Clarifai: ImageVector
    get() {
        if (_clarifai != null) {
            return _clarifai!!
        }
        _clarifai = Builder(name = "Clarifai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.78f, 14.772f)
                arcTo(2.768f, 2.768f, 0.0f, false, true, 0.0f, 12.008f)
                arcToRelative(2.781f, 2.781f, 0.0f, false, true, 2.78f, -2.78f)
                arcToRelative(2.765f, 2.765f, 0.0f, false, true, 2.764f, 2.764f)
                curveToRelative(0.0f, 1.52f, -1.23f, 2.78f, -2.764f, 2.78f)
                close()
                moveTo(17.119f, 1.83f)
                curveToRelative(-2.05f, 0.0f, -2.142f, 1.732f, -5.27f, 1.732f)
                curveToRelative(-3.16f, 0.0f, -3.419f, -1.732f, -5.287f, -1.732f)
                arcToRelative(2.765f, 2.765f, 0.0f, false, false, -2.765f, 2.765f)
                arcToRelative(2.775f, 2.775f, 0.0f, false, false, 2.765f, 2.764f)
                curveToRelative(2.066f, 0.0f, 2.157f, -1.731f, 5.286f, -1.731f)
                curveToRelative(3.16f, 0.0f, 3.418f, 1.731f, 5.286f, 1.731f)
                arcTo(2.765f, 2.765f, 0.0f, false, false, 19.9f, 4.595f)
                arcToRelative(2.778f, 2.778f, 0.0f, false, false, -2.78f, -2.765f)
                close()
                moveTo(17.119f, 16.64f)
                curveToRelative(-2.066f, 0.0f, -2.157f, 1.732f, -5.286f, 1.732f)
                curveToRelative(-3.16f, 0.0f, -3.418f, -1.731f, -5.286f, -1.731f)
                arcToRelative(2.765f, 2.765f, 0.0f, false, false, -2.765f, 2.764f)
                arcToRelative(2.775f, 2.775f, 0.0f, false, false, 2.765f, 2.765f)
                curveToRelative(2.066f, 0.0f, 2.157f, -1.732f, 5.286f, -1.732f)
                curveToRelative(3.16f, 0.0f, 3.418f, 1.732f, 5.286f, 1.732f)
                arcToRelative(2.765f, 2.765f, 0.0f, false, false, 0.0f, -5.53f)
                close()
                moveTo(21.22f, 9.243f)
                curveToRelative(-2.08f, 0.0f, -2.005f, 1.823f, -4.617f, 1.823f)
                curveToRelative(-2.416f, -0.015f, -2.446f, -1.823f, -4.755f, -1.823f)
                curveToRelative(-1.443f, 0.0f, -2.628f, 1.322f, -2.628f, 2.765f)
                reflectiveCurveToRelative(1.2f, 2.764f, 2.765f, 2.764f)
                curveToRelative(2.08f, 0.0f, 2.005f, -1.823f, 4.618f, -1.823f)
                curveToRelative(2.415f, 0.0f, 2.445f, 1.808f, 4.77f, 1.808f)
                curveToRelative(1.442f, 0.0f, 2.627f, -1.322f, 2.627f, -2.765f)
                curveToRelative(0.0f, -1.427f, -1.2f, -2.749f, -2.78f, -2.749f)
                close()
            }
        }
        .build()
        return _clarifai!!
    }

private var _clarifai: ImageVector? = null
