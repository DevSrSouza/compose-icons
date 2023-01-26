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

public val SharpGroup.ClosedCaptionDisabled: ImageVector
    get() {
        if (_closedCaptionDisabled != null) {
            return _closedCaptionDisabled!!
        }
        _closedCaptionDisabled = Builder(name = "ClosedCaptionDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.83f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(14.17f)
                lineTo(17.83f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.17f)
                lineToRelative(-1.83f, -1.83f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.17f)
                lineTo(6.83f, 4.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(17.17f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.83f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(11.0f, 13.83f)
                lineTo(10.17f, 13.0f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.17f)
                lineTo(6.17f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(13.83f)
                close()
            }
        }
        .build()
        return _closedCaptionDisabled!!
    }

private var _closedCaptionDisabled: ImageVector? = null
