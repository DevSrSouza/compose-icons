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

public val TwotoneGroup.NearMeDisabled: ImageVector
    get() {
        if (_nearMeDisabled != null) {
            return _nearMeDisabled!!
        }
        _nearMeDisabled = Builder(name = "NearMeDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1f, 10.44f)
                lineToRelative(1.5f, -4.05f)
                lineToRelative(-4.05f, 1.5f)
                lineTo(16.1f, 10.44f)
                close()
                moveTo(14.57f, 14.57f)
                lineTo(9.43f, 9.43f)
                lineToRelative(-2.71f, 1.01f)
                lineToRelative(4.89f, 1.95f)
                lineToRelative(1.95f, 4.89f)
                lineTo(14.57f, 14.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.34f)
                lineTo(21.0f, 3.0f)
                lineToRelative(-3.34f, 9.0f)
                lineToRelative(-1.56f, -1.56f)
                lineToRelative(1.5f, -4.05f)
                lineToRelative(-4.05f, 1.5f)
                lineTo(12.0f, 6.34f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-5.07f, -5.07f)
                lineTo(14.31f, 21.0f)
                horizontalLineTo(12.9f)
                lineToRelative(-2.83f, -7.07f)
                lineTo(3.0f, 11.1f)
                verticalLineTo(9.69f)
                lineToRelative(4.88f, -1.81f)
                lineTo(2.81f, 2.81f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(14.57f, 14.57f)
                lineTo(9.43f, 9.43f)
                lineToRelative(-2.71f, 1.01f)
                lineToRelative(4.89f, 1.95f)
                lineToRelative(1.95f, 4.89f)
                lineTo(14.57f, 14.57f)
                close()
            }
        }
        .build()
        return _nearMeDisabled!!
    }

private var _nearMeDisabled: ImageVector? = null
