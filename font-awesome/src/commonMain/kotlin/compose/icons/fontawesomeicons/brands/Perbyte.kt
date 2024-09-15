package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Perbyte: ImageVector
    get() {
        if (_perbyte != null) {
            return _perbyte!!
        }
        _perbyte = Builder(name = "Perbyte", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.31f, 284.58f)
                lineTo(246.6f, 284.58f)
                lineTo(246.6f, 383.3f)
                horizontalLineToRelative(58.71f)
                quadToRelative(24.42f, 0.0f, 38.19f, -13.77f)
                reflectiveQuadToRelative(13.77f, -36.11f)
                quadToRelative(0.0f, -21.83f, -14.03f, -35.33f)
                reflectiveQuadTo(305.31f, 284.58f)
                close()
                moveTo(149.43f, 128.7f)
                lineTo(90.72f, 128.7f)
                verticalLineToRelative(98.72f)
                horizontalLineToRelative(58.71f)
                quadToRelative(24.42f, 0.0f, 38.19f, -13.77f)
                reflectiveQuadToRelative(13.77f, -36.11f)
                quadToRelative(0.0f, -21.83f, -14.03f, -35.34f)
                reflectiveQuadTo(149.43f, 128.7f)
                close()
                moveTo(366.65f, 32.0f)
                lineTo(81.35f, 32.0f)
                arcTo(81.44f, 81.44f, 0.0f, false, false, 0.0f, 113.35f)
                lineTo(0.0f, 398.65f)
                arcTo(81.44f, 81.44f, 0.0f, false, false, 81.35f, 480.0f)
                lineTo(366.65f, 480.0f)
                arcTo(81.44f, 81.44f, 0.0f, false, false, 448.0f, 398.65f)
                lineTo(448.0f, 113.35f)
                arcTo(81.44f, 81.44f, 0.0f, false, false, 366.65f, 32.0f)
                close()
                moveTo(430.28f, 398.65f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, true, -63.63f, 63.63f)
                lineTo(81.35f, 462.28f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, true, -63.63f, -63.63f)
                lineTo(17.72f, 113.35f)
                arcTo(63.71f, 63.71f, 0.0f, false, true, 81.35f, 49.72f)
                lineTo(366.65f, 49.72f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, true, 63.63f, 63.63f)
                close()
                moveTo(305.31f, 128.7f)
                lineTo(246.6f, 128.7f)
                verticalLineToRelative(98.72f)
                horizontalLineToRelative(58.71f)
                quadToRelative(24.42f, 0.0f, 38.19f, -13.77f)
                reflectiveQuadToRelative(13.77f, -36.11f)
                quadToRelative(0.0f, -21.83f, -14.03f, -35.34f)
                reflectiveQuadTo(305.31f, 128.7f)
                close()
            }
        }
        .build()
        return _perbyte!!
    }

private var _perbyte: ImageVector? = null
