package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(60.0f)
                lineTo(40.0f, 132.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 24.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(112.0f, 148.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(232.0f, 72.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(85.0f, 177.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -5.6f, 2.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.7f, -2.4f)
                lineTo(58.3f, 161.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(85.0f, 165.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 85.0f, 177.0f)
                close()
                moveTo(205.0f, 177.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -5.6f, 2.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.7f, -2.4f)
                lineToRelative(-15.4f, -15.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(205.0f, 165.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 205.0f, 177.0f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
