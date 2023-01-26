package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ConfirmationNumber: ImageVector
    get() {
        if (_confirmationNumber != null) {
            return _confirmationNumber!!
        }
        _confirmationNumber = Builder(name = "ConfirmationNumber", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.54f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f)
                verticalLineToRelative(2.54f)
                curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f)
                curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f)
                reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f)
                curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f)
                curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f)
                reflectiveCurveToRelative(0.43f, -1.42f, 1.06f, -1.76f)
                curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f)
                close()
                moveTo(13.0f, 17.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 8.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _confirmationNumber!!
    }

private var _confirmationNumber: ImageVector? = null
