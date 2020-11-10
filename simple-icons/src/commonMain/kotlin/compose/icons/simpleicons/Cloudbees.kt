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

public val SimpleIcons.Cloudbees: VectorAsset
    get() {
        if (_cloudbees != null) {
            return _cloudbees!!
        }
        _cloudbees = VectorAssetBuilder(name = "Cloudbees", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.55f, 6.41f)
                curveToRelative(0.0f, -1.2f, 0.73f, -2.28f, 1.88f, -2.8f)
                arcTo(3.51f, 3.51f, 0.0f, false, true, 8.94f, 4.0f)
                lineToRelative(2.52f, -2.35f)
                arcTo(7.25f, 7.25f, 0.0f, false, false, 3.22f, 0.98f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, false, -2.95f, 7.2f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, false, 6.6f, 4.64f)
                horizontalLineToRelative(2.58f)
                verticalLineToRelative(-3.3f)
                lineTo(6.87f, 9.52f)
                curveTo(5.04f, 9.5f, 3.55f, 8.11f, 3.55f, 6.4f)
                close()
                moveTo(17.06f, 11.14f)
                horizontalLineToRelative(-2.58f)
                verticalLineToRelative(3.3f)
                horizontalLineToRelative(2.58f)
                curveToRelative(1.83f, 0.0f, 3.32f, 1.4f, 3.32f, 3.1f)
                curveToRelative(0.0f, 1.72f, -1.49f, 3.1f, -3.32f, 3.1f)
                reflectiveCurveToRelative(-3.32f, -1.37f, -3.32f, -3.08f)
                lineTo(13.74f, 6.4f)
                curveToRelative(0.0f, -1.58f, -0.63f, -3.11f, -1.76f, -4.29f)
                lineTo(9.46f, 4.48f)
                curveToRelative(0.47f, 0.53f, 0.73f, 1.22f, 0.73f, 1.93f)
                verticalLineToRelative(11.14f)
                curveToRelative(0.0f, 3.54f, 3.08f, 6.41f, 6.87f, 6.41f)
                curveToRelative(3.8f, 0.0f, 6.87f, -2.87f, 6.87f, -6.41f)
                reflectiveCurveToRelative(-3.07f, -6.41f, -6.87f, -6.41f)
                close()
            }
        }
        .build()
        return _cloudbees!!
    }

private var _cloudbees: VectorAsset? = null
