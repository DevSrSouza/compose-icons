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

public val SolidGroup.ArrowRotateRight: ImageVector
    get() {
        if (_arrowRotateRight != null) {
            return _arrowRotateRight!!
        }
        _arrowRotateRight = Builder(name = "ArrowRotateRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.3f, 160.0f)
                horizontalLineTo(336.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(464.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(51.2f)
                lineTo(414.4f, 97.6f)
                curveToRelative(-87.5f, -87.5f, -229.3f, -87.5f, -316.8f, 0.0f)
                reflectiveCurveToRelative(-87.5f, 229.3f, 0.0f, 316.8f)
                reflectiveCurveToRelative(229.3f, 87.5f, 316.8f, 0.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                curveToRelative(-62.5f, 62.5f, -163.8f, 62.5f, -226.3f, 0.0f)
                reflectiveCurveToRelative(-62.5f, -163.8f, 0.0f, -226.3f)
                reflectiveCurveToRelative(163.8f, -62.5f, 226.3f, 0.0f)
                lineTo(386.3f, 160.0f)
                close()
            }
        }
        .build()
        return _arrowRotateRight!!
    }

private var _arrowRotateRight: ImageVector? = null
