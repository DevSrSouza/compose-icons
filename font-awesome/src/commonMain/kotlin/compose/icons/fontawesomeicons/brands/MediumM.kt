package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.MediumM: ImageVector
    get() {
        if (_mediumM != null) {
            return _mediumM!!
        }
        _mediumM = Builder(name = "MediumM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.5f, 142.3f)
                curveToRelative(0.6f, -5.9f, -1.7f, -11.8f, -6.1f, -15.8f)
                lineTo(20.3f, 72.1f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(140.2f)
                lineToRelative(108.4f, 237.7f)
                lineTo(364.2f, 64.0f)
                horizontalLineToRelative(133.7f)
                verticalLineToRelative(8.1f)
                lineToRelative(-38.6f, 37.0f)
                curveToRelative(-3.3f, 2.5f, -5.0f, 6.7f, -4.3f, 10.8f)
                verticalLineToRelative(272.0f)
                curveToRelative(-0.7f, 4.1f, 1.0f, 8.3f, 4.3f, 10.8f)
                lineToRelative(37.7f, 37.0f)
                verticalLineToRelative(8.1f)
                horizontalLineTo(307.3f)
                verticalLineToRelative(-8.1f)
                lineToRelative(39.1f, -37.9f)
                curveToRelative(3.8f, -3.8f, 3.8f, -5.0f, 3.8f, -10.8f)
                verticalLineTo(171.2f)
                lineTo(241.5f, 447.1f)
                horizontalLineToRelative(-14.7f)
                lineTo(100.4f, 171.2f)
                verticalLineToRelative(184.9f)
                curveToRelative(-1.1f, 7.8f, 1.5f, 15.6f, 7.0f, 21.2f)
                lineToRelative(50.8f, 61.6f)
                verticalLineToRelative(8.1f)
                horizontalLineToRelative(-144.0f)
                verticalLineToRelative(-8.0f)
                lineTo(65.0f, 377.3f)
                curveToRelative(5.4f, -5.6f, 7.9f, -13.5f, 6.5f, -21.2f)
                verticalLineTo(142.3f)
                close()
            }
        }
        .build()
        return _mediumM!!
    }

private var _mediumM: ImageVector? = null
