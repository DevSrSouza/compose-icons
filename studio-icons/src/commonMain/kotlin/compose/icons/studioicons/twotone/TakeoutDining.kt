package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.TakeoutDining: ImageVector
    get() {
        if (_takeoutDining != null) {
            return _takeoutDining!!
        }
        _takeoutDining = Builder(name = "TakeoutDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.83f, 5.0f)
                lineToRelative(-2.8f, 2.73f)
                lineToRelative(0.09f, 1.27f)
                lineToRelative(9.75f, 0.0f)
                lineToRelative(0.09f, -1.27f)
                lineToRelative(-2.8f, -2.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.79f, 18.0f)
                lineToRelative(8.44f, 0.0f)
                lineToRelative(0.51f, -7.0f)
                lineToRelative(-9.46f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.59f, 6.05f)
                lineTo(19.0f, 7.63f)
                lineToRelative(0.03f, -0.56f)
                lineTo(14.98f, 3.0f)
                horizontalLineTo(9.02f)
                lineTo(4.97f, 7.07f)
                lineTo(5.0f, 7.57f)
                lineTo(3.41f, 6.01f)
                lineTo(2.0f, 7.44f)
                lineToRelative(3.23f, 3.11f)
                lineTo(5.93f, 20.0f)
                horizontalLineToRelative(12.14f)
                lineToRelative(0.7f, -9.44f)
                lineTo(22.0f, 7.46f)
                lineTo(20.59f, 6.05f)
                close()
                moveTo(16.23f, 18.0f)
                horizontalLineTo(7.79f)
                lineToRelative(-0.51f, -7.0f)
                horizontalLineToRelative(9.46f)
                lineTo(16.23f, 18.0f)
                close()
                moveTo(16.87f, 9.0f)
                horizontalLineTo(7.12f)
                lineTo(7.03f, 7.73f)
                lineTo(9.83f, 5.0f)
                horizontalLineToRelative(4.33f)
                lineToRelative(2.8f, 2.73f)
                lineTo(16.87f, 9.0f)
                close()
            }
        }
        .build()
        return _takeoutDining!!
    }

private var _takeoutDining: ImageVector? = null
