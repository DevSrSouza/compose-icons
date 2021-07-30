package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = Builder(name = "Ethereum", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9531f, 3.0f)
                lineTo(6.9297f, 15.5527f)
                lineTo(16.0039f, 20.0137f)
                lineTo(24.9336f, 15.5488f)
                lineTo(17.0527f, 3.0f)
                lineTo(16.5f, 3.0f)
                lineTo(14.9531f, 3.0f)
                close()
                moveTo(15.0f, 6.6367f)
                lineTo(15.0f, 10.9883f)
                lineTo(11.0859f, 12.7637f)
                lineTo(15.0f, 6.6367f)
                close()
                moveTo(17.0f, 6.6777f)
                lineTo(20.8184f, 12.7578f)
                lineTo(17.0f, 11.0039f)
                lineTo(17.0f, 6.6777f)
                close()
                moveTo(15.0f, 13.1836f)
                lineTo(15.0f, 17.291f)
                lineTo(10.6563f, 15.1543f)
                lineTo(15.0f, 13.1836f)
                close()
                moveTo(17.0f, 13.207f)
                lineTo(21.2461f, 15.1563f)
                lineTo(17.0f, 17.2793f)
                lineTo(17.0f, 13.207f)
                close()
                moveTo(7.0f, 17.5117f)
                lineTo(7.0f, 20.0313f)
                lineTo(14.9277f, 28.875f)
                lineTo(16.0f, 28.875f)
                lineTo(17.0723f, 28.875f)
                lineTo(25.0f, 20.0313f)
                lineTo(25.0f, 17.5117f)
                lineTo(16.0f, 22.125f)
                lineTo(7.0f, 17.5117f)
                close()
                moveTo(11.5215f, 22.0781f)
                lineTo(15.0f, 23.8613f)
                lineTo(15.0f, 25.957f)
                lineTo(11.5215f, 22.0781f)
                close()
                moveTo(20.4785f, 22.0781f)
                lineTo(17.0f, 25.957f)
                lineTo(17.0f, 23.8613f)
                lineTo(20.4785f, 22.0781f)
                close()
            }
        }
        .build()
        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
