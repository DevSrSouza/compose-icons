package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ChinaRailwayLine: ImageVector
    get() {
        if (_chinaRailwayLine != null) {
            return _chinaRailwayLine!!
        }
        _chinaRailwayLine = Builder(name = "ChinaRailwayLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(10.0f, 2.223f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.223f)
                arcToRelative(9.003f, 9.003f, 0.0f, false, true, 2.993f, 16.266f)
                lineToRelative(-1.11f, -1.664f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -7.767f, 0.0f)
                lineToRelative(-1.109f, 1.664f)
                arcTo(9.003f, 9.003f, 0.0f, false, true, 10.0f, 2.223f)
                close()
            }
        }
        .build()
        return _chinaRailwayLine!!
    }

private var _chinaRailwayLine: ImageVector? = null
