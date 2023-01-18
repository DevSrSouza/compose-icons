package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(388.0f, 160.77f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -5.85f, -14.91f)
                lineToRelative(-112.0f, -112.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 48.0f)
                verticalLineTo(212.52f)
                lineToRelative(-79.0f, -67.71f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -26.0f, 30.38f)
                lineTo(225.27f, 256.0f)
                lineTo(131.0f, 336.81f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 26.0f, 30.38f)
                lineToRelative(79.0f, -67.71f)
                verticalLineTo(464.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.14f, 14.14f)
                lineToRelative(112.0f, -112.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 381.0f, 336.81f)
                lineTo(286.73f, 256.0f)
                lineTo(381.0f, 175.19f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 388.0f, 160.77f)
                close()
                moveTo(338.58f, 353.13f)
                lineTo(276.0f, 415.72f)
                verticalLineTo(299.49f)
                close()
                moveTo(276.0f, 212.52f)
                verticalLineTo(96.28f)
                lineToRelative(62.59f, 62.59f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
