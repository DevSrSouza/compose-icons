package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.TableTennis: ImageVector
    get() {
        if (_tableTennis != null) {
            return _tableTennis!!
        }
        _tableTennis = Builder(name = "TableTennis", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.2f, 296.5f)
                curveTo(527.7f, 218.7f, 512.0f, 126.2f, 449.0f, 63.1f)
                curveTo(365.1f, -21.0f, 229.0f, -21.0f, 145.1f, 63.1f)
                lineToRelative(-56.0f, 56.1f)
                lineToRelative(211.5f, 211.5f)
                curveToRelative(46.1f, -62.1f, 131.5f, -77.4f, 195.6f, -34.2f)
                close()
                moveTo(278.3f, 376.2f)
                lineTo(57.9f, 155.9f)
                curveToRelative(-27.3f, 45.3f, -21.7f, 105.0f, 17.3f, 144.1f)
                lineToRelative(34.5f, 34.6f)
                lineTo(6.7f, 424.0f)
                curveToRelative(-8.6f, 7.5f, -9.1f, 20.7f, -1.0f, 28.8f)
                lineToRelative(53.4f, 53.5f)
                curveToRelative(8.0f, 8.1f, 21.2f, 7.6f, 28.7f, -1.0f)
                lineTo(177.1f, 402.0f)
                lineToRelative(35.7f, 35.7f)
                curveToRelative(19.7f, 19.7f, 44.6f, 30.5f, 70.3f, 33.3f)
                curveToRelative(-7.1f, -17.0f, -11.0f, -35.6f, -11.0f, -55.1f)
                curveToRelative(-0.1f, -13.8f, 2.5f, -27.0f, 6.2f, -39.7f)
                close()
                moveTo(416.0f, 320.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _tableTennis!!
    }

private var _tableTennis: ImageVector? = null
