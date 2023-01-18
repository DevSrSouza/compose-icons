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

public val IonIcons.CalculatorSharp: ImageVector
    get() {
        if (_calculatorSharp != null) {
            return _calculatorSharp!!
        }
        _calculatorSharp = Builder(name = "CalculatorSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(112.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 48.0f)
                lineTo(96.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(400.0f, 480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                close()
                moveTo(192.0f, 432.0f)
                lineTo(144.0f, 432.0f)
                lineTo(144.0f, 384.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(192.0f, 352.0f)
                lineTo(144.0f, 352.0f)
                lineTo(144.0f, 304.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(192.0f, 272.0f)
                lineTo(144.0f, 272.0f)
                lineTo(144.0f, 224.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(280.0f, 432.0f)
                lineTo(232.0f, 432.0f)
                lineTo(232.0f, 384.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(280.0f, 352.0f)
                lineTo(232.0f, 352.0f)
                lineTo(232.0f, 304.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(280.0f, 272.0f)
                lineTo(232.0f, 272.0f)
                lineTo(232.0f, 224.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(368.0f, 432.0f)
                lineTo(320.0f, 432.0f)
                lineTo(320.0f, 304.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(368.0f, 272.0f)
                lineTo(320.0f, 272.0f)
                lineTo(320.0f, 224.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(368.0f, 176.0f)
                lineTo(144.0f, 176.0f)
                lineTo(144.0f, 80.0f)
                lineTo(368.0f, 80.0f)
                close()
            }
        }
        .build()
        return _calculatorSharp!!
    }

private var _calculatorSharp: ImageVector? = null
