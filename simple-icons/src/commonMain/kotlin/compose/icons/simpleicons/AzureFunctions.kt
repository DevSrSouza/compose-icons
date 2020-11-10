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

public val SimpleIcons.AzureFunctions: VectorAsset
    get() {
        if (_azureFunctions != null) {
            return _azureFunctions!!
        }
        _azureFunctions = VectorAssetBuilder(name = "AzureFunctions", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.515f, 5.106f)
                curveToRelative(-0.205f, -0.204f, -0.612f, -0.204f, -0.817f, 0.0f)
                curveToRelative(-0.102f, 0.103f, -0.204f, 0.256f, -0.204f, 0.409f)
                curveToRelative(0.0f, 0.153f, 0.05f, 0.306f, 0.204f, 0.408f)
                lineToRelative(5.412f, 5.362f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.0f, 0.868f)
                lineToRelative(-5.566f, 5.515f)
                arcToRelative(0.693f, 0.693f, 0.0f, false, false, 0.0f, 0.868f)
                curveToRelative(0.255f, 0.204f, 0.614f, 0.204f, 0.817f, 0.0f)
                lineToRelative(6.485f, -6.383f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.0f, -0.868f)
                lineToRelative(-6.331f, -6.179f)
                close()
                moveTo(1.992f, 12.153f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.0f, -0.868f)
                lineToRelative(5.31f, -5.362f)
                curveToRelative(0.102f, -0.102f, 0.204f, -0.255f, 0.204f, -0.408f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, -0.204f, -0.409f)
                curveToRelative(-0.205f, -0.204f, -0.612f, -0.204f, -0.817f, 0.0f)
                lineTo(0.154f, 11.285f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.0f, 0.868f)
                lineToRelative(6.433f, 6.383f)
                curveToRelative(0.255f, 0.204f, 0.614f, 0.204f, 0.817f, 0.0f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.0f, -0.868f)
                lineToRelative(-5.412f, -5.515f)
                close()
                moveTo(7.915f, 22.417f)
                lineTo(17.617f, 8.63f)
                horizontalLineToRelative(-4.699f)
                lineToRelative(4.597f, -7.047f)
                lineTo(10.67f, 1.583f)
                lineTo(6.997f, 12.051f)
                lineToRelative(4.493f, 0.051f)
                lineToRelative(-3.574f, 10.315f)
                close()
            }
        }
        .build()
        return _azureFunctions!!
    }

private var _azureFunctions: VectorAsset? = null
