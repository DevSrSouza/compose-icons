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

public val SolidGroup.TableTennisPaddleBall: ImageVector
    get() {
        if (_tableTennisPaddleBall != null) {
            return _tableTennisPaddleBall!!
        }
        _tableTennisPaddleBall = Builder(name = "TableTennisPaddleBall", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 288.0f)
                curveToRelative(-50.1f, 0.0f, -93.6f, 28.8f, -114.6f, 70.8f)
                lineTo(68.9f, 126.3f)
                lineToRelative(0.6f, -0.6f)
                lineToRelative(60.1f, -60.1f)
                curveToRelative(87.5f, -87.5f, 229.3f, -87.5f, 316.8f, 0.0f)
                curveToRelative(67.1f, 67.1f, 82.7f, 166.3f, 46.8f, 248.3f)
                curveTo(471.8f, 297.6f, 445.0f, 288.0f, 416.0f, 288.0f)
                close()
                moveTo(49.3f, 151.9f)
                lineTo(290.1f, 392.7f)
                curveToRelative(-1.4f, 7.5f, -2.1f, 15.3f, -2.1f, 23.3f)
                curveToRelative(0.0f, 23.2f, 6.2f, 44.9f, 16.9f, 63.7f)
                curveToRelative(-3.0f, 0.2f, -6.1f, 0.3f, -9.2f, 0.3f)
                horizontalLineTo(293.0f)
                curveToRelative(-33.9f, 0.0f, -66.5f, -13.5f, -90.5f, -37.5f)
                lineToRelative(-9.8f, -9.8f)
                curveToRelative(-13.1f, -13.1f, -34.6f, -12.4f, -46.8f, 1.7f)
                lineTo(88.2f, 501.0f)
                curveToRelative(-5.8f, 6.7f, -14.2f, 10.7f, -23.0f, 11.0f)
                reflectiveCurveToRelative(-17.5f, -3.1f, -23.8f, -9.4f)
                lineToRelative(-32.0f, -32.0f)
                curveTo(3.1f, 464.3f, -0.3f, 455.7f, 0.0f, 446.9f)
                reflectiveCurveToRelative(4.3f, -17.2f, 11.0f, -23.0f)
                lineToRelative(66.6f, -57.7f)
                curveToRelative(14.0f, -12.2f, 14.8f, -33.7f, 1.7f, -46.8f)
                lineToRelative(-9.8f, -9.8f)
                curveTo(45.5f, 285.5f, 32.0f, 252.9f, 32.0f, 219.0f)
                verticalLineToRelative(-2.7f)
                curveToRelative(0.0f, -22.8f, 6.1f, -44.9f, 17.3f, -64.3f)
                close()
                moveTo(416.0f, 512.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.0f, 96.0f, -96.0f, 96.0f)
                close()
            }
        }
        .build()
        return _tableTennisPaddleBall!!
    }

private var _tableTennisPaddleBall: ImageVector? = null
