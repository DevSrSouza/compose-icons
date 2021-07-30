package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.ColorPicker: ImageVector
    get() {
        if (_colorPicker != null) {
            return _colorPicker!!
        }
        _colorPicker = Builder(name = "ColorPicker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4f, 7.34f)
                lineTo(16.66f, 4.6f)
                arcTo(1.92f, 1.92f, 0.0f, false, false, 14.0f, 4.53f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(10.71f, 5.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.29f, 6.71f)
                lineTo(10.53f, 8.0f)
                lineTo(5.0f, 13.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.57f, 1.21f)
                lineTo(4.0f, 18.91f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.29f, 0.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineToRelative(0.09f)
                lineToRelative(4.17f, -0.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.21f, -0.57f)
                lineToRelative(5.58f, -5.58f)
                lineToRelative(1.24f, 1.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineToRelative(-1.24f, -1.24f)
                lineToRelative(2.0f, -2.0f)
                arcTo(1.92f, 1.92f, 0.0f, false, false, 19.4f, 7.34f)
                close()
                moveTo(9.08f, 17.62f)
                lineToRelative(-3.0f, 0.28f)
                lineToRelative(0.27f, -3.0f)
                lineTo(12.0f, 9.36f)
                lineToRelative(2.69f, 2.7f)
                close()
                moveTo(16.08f, 10.62f)
                lineTo(13.36f, 8.0f)
                lineTo(15.27f, 6.0f)
                lineTo(18.0f, 8.73f)
                close()
            }
        }
        .build()
        return _colorPicker!!
    }

private var _colorPicker: ImageVector? = null
