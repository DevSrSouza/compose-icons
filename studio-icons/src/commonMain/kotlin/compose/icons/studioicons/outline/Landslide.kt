package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Landslide: ImageVector
    get() {
        if (_landslide != null) {
            return _landslide!!
        }
        _landslide = Builder(name = "Landslide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(20.0f)
                lineToRelative(-6.0f, -8.0f)
                lineTo(11.0f, 12.0f)
                close()
                moveTo(12.53f, 14.77f)
                lineTo(6.0f, 16.95f)
                lineToRelative(-2.0f, -0.67f)
                verticalLineToRelative(-1.89f)
                lineToRelative(2.0f, 0.67f)
                lineToRelative(3.95f, -1.32f)
                lineTo(12.53f, 14.77f)
                close()
                moveTo(7.0f, 10.0f)
                lineToRelative(1.57f, 2.09f)
                lineTo(6.0f, 12.95f)
                lineToRelative(-2.0f, -0.67f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-1.61f)
                lineToRelative(2.0f, 0.67f)
                lineToRelative(9.03f, -3.01f)
                lineTo(18.0f, 20.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                verticalLineTo(1.0f)
                lineToRelative(-5.0f, -1.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(3.0f, 2.0f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(11.0f, 3.07f)
                lineToRelative(1.42f, -0.95f)
                lineTo(15.0f, 2.64f)
                verticalLineToRelative(2.01f)
                lineToRelative(-2.77f, 1.11f)
                lineTo(11.0f, 4.93f)
                verticalLineTo(3.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 7.0f)
                lineTo(16.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(4.5f, -2.0f)
                verticalLineTo(8.0f)
                lineTo(18.5f, 7.0f)
                close()
                moveTo(21.0f, 10.7f)
                lineToRelative(-2.2f, 0.98f)
                lineTo(18.0f, 11.04f)
                verticalLineTo(9.96f)
                lineToRelative(1.0f, -0.8f)
                lineToRelative(2.0f, 0.44f)
                verticalLineTo(10.7f)
                close()
            }
        }
        .build()
        return _landslide!!
    }

private var _landslide: ImageVector? = null
