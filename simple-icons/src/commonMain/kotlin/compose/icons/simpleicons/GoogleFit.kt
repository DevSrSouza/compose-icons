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

public val SimpleIcons.GoogleFit: VectorAsset
    get() {
        if (_googleFit != null) {
            return _googleFit!!
        }
        _googleFit = VectorAssetBuilder(name = "GoogleFit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.84f)
                curveToRelative(-3.315f, 0.0f, -6.0f, 2.678f, -6.0f, 5.982f)
                arcToRelative(5.948f, 5.948f, 0.0f, false, false, 1.758f, 4.23f)
                lineToRelative(0.54f, 0.541f)
                lineTo(3.502f, 13.8f)
                lineToRelative(2.615f, -2.603f)
                lineToRelative(-1.205f, -1.21f)
                lineToRelative(-0.541f, -0.543f)
                arcToRelative(2.273f, 2.273f, 0.0f, false, true, -0.674f, -1.622f)
                curveToRelative(0.0f, -0.534f, 0.186f, -1.024f, 0.493f, -1.414f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 3.448f, -0.198f)
                lineToRelative(0.538f, 0.522f)
                lineToRelative(1.213f, 1.2f)
                curveToRelative(-1.96f, 1.96f, -3.923f, 3.914f, -5.887f, 5.868f)
                lineToRelative(1.403f, 1.407f)
                lineToRelative(1.209f, 1.203f)
                lineToRelative(3.27f, 3.274f)
                lineToRelative(-0.004f, 0.003f)
                lineTo(12.0f, 22.16f)
                lineToRelative(2.616f, -2.475f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(5.885f, -5.883f)
                lineToRelative(1.744f, -1.747f)
                curveToRelative(1.22f, -1.215f, 1.917f, -3.09f, 1.727f, -4.983f)
                curveToRelative(-0.288f, -2.865f, -2.662f, -5.016f, -5.544f, -5.213f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.667f, 1.736f)
                lineToRelative(-1.754f, 1.743f)
                lineToRelative(-1.213f, -1.21f)
                lineToRelative(-0.55f, -0.533f)
                arcTo(5.995f, 5.995f, 0.0f, false, false, 6.0f, 1.841f)
                close()
                moveTo(17.96f, 5.528f)
                arcToRelative(2.303f, 2.303f, 0.0f, false, true, 2.32f, 1.963f)
                arcToRelative(2.286f, 2.286f, 0.0f, false, true, -0.657f, 1.959f)
                lineToRelative(-1.744f, 1.747f)
                lineToRelative(-5.882f, 5.876f)
                lineToRelative(-3.271f, -3.263f)
                lineToRelative(3.277f, -3.263f)
                lineToRelative(4.368f, -4.346f)
                curveToRelative(0.426f, -0.425f, 0.99f, -0.663f, 1.589f, -0.673f)
                close()
            }
        }
        .build()
        return _googleFit!!
    }

private var _googleFit: VectorAsset? = null
