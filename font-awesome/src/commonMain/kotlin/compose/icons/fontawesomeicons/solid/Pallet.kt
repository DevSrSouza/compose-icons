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

public val SolidGroup.Pallet: ImageVector
    get() {
        if (_pallet != null) {
            return _pallet!!
        }
        _pallet = Builder(name = "Pallet", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(64.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(96.0f, 512.0f)
                lineTo(320.0f, 512.0f)
                lineTo(544.0f, 512.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(576.0f, 448.0f)
                lineTo(576.0f, 384.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(544.0f, 320.0f)
                lineTo(320.0f, 320.0f)
                lineTo(96.0f, 320.0f)
                lineTo(32.0f, 320.0f)
                close()
                moveTo(128.0f, 384.0f)
                lineTo(288.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(128.0f, 448.0f)
                lineTo(128.0f, 384.0f)
                close()
                moveTo(352.0f, 384.0f)
                lineTo(512.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(352.0f, 448.0f)
                lineTo(352.0f, 384.0f)
                close()
            }
        }
        .build()
        return _pallet!!
    }

private var _pallet: ImageVector? = null
