package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DoNotTouch: ImageVector
    get() {
        if (_doNotTouch != null) {
            return _doNotTouch!!
        }
        _doNotTouch = Builder(name = "DoNotTouch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.17f)
                lineToRelative(-2.5f, -2.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.17f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(9.17f)
                lineToRelative(6.0f, 6.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.5f, 3.0f)
                horizontalLineTo(7.01f)
                verticalLineToRelative(1.18f)
                lineTo(9.5f, 6.67f)
                verticalLineTo(3.0f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(7.0f, 9.83f)
                verticalLineToRelative(4.3f)
                lineToRelative(-3.32f, -1.9f)
                lineTo(2.0f, 13.88f)
                lineTo(9.68f, 22.0f)
                horizontalLineToRelative(9.54f)
                lineToRelative(0.56f, 0.61f)
                lineTo(21.19f, 21.19f)
                close()
            }
        }
        .build()
        return _doNotTouch!!
    }

private var _doNotTouch: ImageVector? = null
