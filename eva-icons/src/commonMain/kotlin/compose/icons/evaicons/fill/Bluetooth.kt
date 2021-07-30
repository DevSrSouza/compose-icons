package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.63f, 12.0f)
                lineToRelative(4.0f, -3.79f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, -0.13f, -1.77f)
                lineTo(12.83f, 3.21f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -1.21f, -0.08f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.62f, 1.0f)
                verticalLineToRelative(6.2f)
                lineToRelative(-3.19f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.25f, 7.63f)
                lineTo(9.72f, 12.0f)
                lineToRelative(-3.5f, 4.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.16f, 1.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.38f)
                lineTo(11.0f, 13.56f)
                verticalLineToRelative(6.29f)
                arcTo(1.16f, 1.16f, 0.0f, false, false, 12.16f, 21.0f)
                arcToRelative(1.16f, 1.16f, 0.0f, false, false, 0.67f, -0.21f)
                lineToRelative(4.64f, -3.18f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, 0.49f, -0.85f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.34f, -0.91f)
                close()
                moveTo(13.0f, 5.76f)
                lineToRelative(2.5f, 1.73f)
                lineTo(13.0f, 9.85f)
                close()
                moveTo(13.0f, 18.25f)
                lineTo(13.0f, 14.18f)
                lineToRelative(2.47f, 2.38f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
