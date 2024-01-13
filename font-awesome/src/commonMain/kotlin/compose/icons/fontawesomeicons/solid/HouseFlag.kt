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

public val SolidGroup.HouseFlag: ImageVector
    get() {
        if (_houseFlag != null) {
            return _houseFlag!!
        }
        _houseFlag = Builder(name = "HouseFlag", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(192.0f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(624.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(512.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(416.0f, 159.0f)
                lineTo(276.8f, 39.7f)
                curveToRelative(-12.0f, -10.3f, -29.7f, -10.3f, -41.7f, 0.0f)
                lineToRelative(-224.0f, 192.0f)
                curveTo(1.0f, 240.4f, -2.7f, 254.5f, 2.0f, 267.1f)
                reflectiveCurveTo(18.6f, 288.0f, 32.0f, 288.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.7f)
                lineToRelative(0.2f, 0.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(159.0f)
                close()
            }
        }
        .build()
        return _houseFlag!!
    }

private var _houseFlag: ImageVector? = null
