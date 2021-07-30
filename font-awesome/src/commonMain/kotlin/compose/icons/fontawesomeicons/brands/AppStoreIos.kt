package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.AppStoreIos: ImageVector
    get() {
        if (_appStoreIos != null) {
            return _appStoreIos!!
        }
        _appStoreIos = Builder(name = "AppStoreIos", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(127.0f, 384.5f)
                curveToRelative(-5.5f, 9.6f, -17.8f, 12.8f, -27.3f, 7.3f)
                curveToRelative(-9.6f, -5.5f, -12.8f, -17.8f, -7.3f, -27.3f)
                lineToRelative(14.3f, -24.7f)
                curveToRelative(16.1f, -4.9f, 29.3f, -1.1f, 39.6f, 11.4f)
                lineTo(127.0f, 384.5f)
                close()
                moveTo(265.9f, 330.6f)
                lineTo(84.0f, 330.6f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -9.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(9.0f, -20.0f, 20.0f, -20.0f)
                horizontalLineToRelative(51.0f)
                lineToRelative(65.4f, -113.2f)
                lineToRelative(-20.5f, -35.4f)
                curveToRelative(-5.5f, -9.6f, -2.2f, -21.8f, 7.3f, -27.3f)
                curveToRelative(9.6f, -5.5f, 21.8f, -2.2f, 27.3f, 7.3f)
                lineToRelative(8.9f, 15.4f)
                lineToRelative(8.9f, -15.4f)
                curveToRelative(5.5f, -9.6f, 17.8f, -12.8f, 27.3f, -7.3f)
                curveToRelative(9.6f, 5.5f, 12.8f, 17.8f, 7.3f, 27.3f)
                lineToRelative(-85.8f, 148.6f)
                horizontalLineToRelative(62.1f)
                curveToRelative(20.2f, 0.0f, 31.5f, 23.7f, 22.7f, 40.0f)
                close()
                moveTo(364.0f, 330.6f)
                horizontalLineToRelative(-29.0f)
                lineToRelative(19.6f, 33.9f)
                curveToRelative(5.5f, 9.6f, 2.2f, 21.8f, -7.3f, 27.3f)
                curveToRelative(-9.6f, 5.5f, -21.8f, 2.2f, -27.3f, -7.3f)
                curveToRelative(-32.9f, -56.9f, -57.5f, -99.7f, -74.0f, -128.1f)
                curveToRelative(-16.7f, -29.0f, -4.8f, -58.0f, 7.1f, -67.8f)
                curveToRelative(13.1f, 22.7f, 32.7f, 56.7f, 58.9f, 102.0f)
                horizontalLineToRelative(52.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, 9.0f, 20.0f, 20.0f)
                curveToRelative(0.0f, 11.1f, -9.0f, 20.0f, -20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _appStoreIos!!
    }

private var _appStoreIos: ImageVector? = null
