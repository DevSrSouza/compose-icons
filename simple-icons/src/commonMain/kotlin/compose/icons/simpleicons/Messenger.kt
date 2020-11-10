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

public val SimpleIcons.Messenger: VectorAsset
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = VectorAssetBuilder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.64f)
                curveTo(0.0f, 4.95f, 5.24f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 4.95f, 12.0f, 11.64f)
                reflectiveCurveToRelative(-5.24f, 11.64f, -12.0f, 11.64f)
                curveToRelative(-1.21f, 0.0f, -2.38f, -0.16f, -3.47f, -0.46f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -0.64f, 0.05f)
                lineTo(5.5f, 23.92f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -1.35f, -0.85f)
                lineToRelative(-0.07f, -2.14f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, false, -0.32f, -0.68f)
                arcTo(11.39f, 11.39f, 0.0f, false, true, 0.0f, 11.64f)
                close()
                moveTo(8.32f, 9.45f)
                lineToRelative(-3.52f, 5.6f)
                curveToRelative(-0.35f, 0.53f, 0.32f, 1.14f, 0.82f, 0.75f)
                lineToRelative(3.79f, -2.87f)
                curveToRelative(0.26f, -0.2f, 0.6f, -0.2f, 0.87f, 0.0f)
                lineToRelative(2.8f, 2.1f)
                curveToRelative(0.84f, 0.63f, 2.04f, 0.4f, 2.6f, -0.48f)
                lineToRelative(3.52f, -5.6f)
                curveToRelative(0.35f, -0.53f, -0.32f, -1.13f, -0.82f, -0.75f)
                lineToRelative(-3.79f, 2.87f)
                curveToRelative(-0.25f, 0.2f, -0.6f, 0.2f, -0.86f, 0.0f)
                lineToRelative(-2.8f, -2.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -2.61f, 0.48f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: VectorAsset? = null
