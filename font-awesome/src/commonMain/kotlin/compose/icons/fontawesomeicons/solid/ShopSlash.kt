package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShopSlash: ImageVector
    get() {
        if (_shopSlash != null) {
            return _shopSlash!!
        }
        _shopSlash = Builder(name = "ShopSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-54.8f, -43.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(512.0f)
                verticalLineTo(376.0f)
                lineTo(384.0f, 275.7f)
                verticalLineTo(224.0f)
                horizontalLineTo(320.0f)
                verticalLineToRelative(1.5f)
                lineTo(277.2f, 192.0f)
                horizontalLineTo(603.2f)
                curveToRelative(20.3f, 0.0f, 36.8f, -16.5f, 36.8f, -36.8f)
                curveToRelative(0.0f, -7.3f, -2.2f, -14.4f, -6.2f, -20.4f)
                lineTo(558.2f, 21.4f)
                curveTo(549.3f, 8.0f, 534.4f, 0.0f, 518.3f, 0.0f)
                horizontalLineTo(121.7f)
                curveToRelative(-16.0f, 0.0f, -31.0f, 8.0f, -39.9f, 21.4f)
                lineTo(74.1f, 32.8f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(36.8f, 192.0f)
                horizontalLineToRelative(85.0f)
                lineTo(21.0f, 112.5f)
                lineTo(6.2f, 134.7f)
                curveToRelative(-4.0f, 6.1f, -6.2f, 13.2f, -6.2f, 20.4f)
                curveTo(0.0f, 175.5f, 16.5f, 192.0f, 36.8f, 192.0f)
                close()
                moveTo(320.0f, 384.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(384.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(336.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(398.5f)
                lineToRelative(-64.0f, -50.4f)
                verticalLineTo(384.0f)
                close()
                moveTo(544.0f, 512.0f)
                lineToRelative(-0.3f, 0.0f)
                horizontalLineToRelative(0.6f)
                lineToRelative(-0.3f, 0.0f)
                close()
            }
        }
        .build()
        return _shopSlash!!
    }

private var _shopSlash: ImageVector? = null
