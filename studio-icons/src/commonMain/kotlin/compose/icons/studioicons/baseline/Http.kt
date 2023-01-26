package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Http: ImageVector
    get() {
        if (_http != null) {
            return _http!!
        }
        _http = Builder(name = "Http", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.5f, 9.0f)
                lineTo(1.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                lineTo(4.5f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 9.0f)
                lineTo(4.5f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 10.5f)
                horizontalLineToRelative(1.5f)
                lineTo(8.5f, 15.0f)
                lineTo(10.0f, 15.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.5f)
                lineTo(11.5f, 9.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(12.5f, 10.5f)
                lineTo(14.0f, 10.5f)
                lineTo(14.0f, 15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                lineTo(17.0f, 10.5f)
                lineTo(17.0f, 9.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21.5f, 9.0f)
                lineTo(18.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _http!!
    }

private var _http: ImageVector? = null
