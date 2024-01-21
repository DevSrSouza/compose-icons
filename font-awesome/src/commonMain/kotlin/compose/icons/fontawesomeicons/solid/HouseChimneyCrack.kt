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

public val SolidGroup.HouseChimneyCrack: ImageVector
    get() {
        if (_houseChimneyCrack != null) {
            return _houseChimneyCrack!!
        }
        _houseChimneyCrack = Builder(name = "HouseChimneyCrack", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.8f, 255.5f)
                curveToRelative(0.0f, 18.0f, -15.0f, 32.1f, -32.0f, 32.1f)
                horizontalLineToRelative(-32.0f)
                lineToRelative(0.7f, 160.2f)
                curveToRelative(0.2f, 35.5f, -28.5f, 64.3f, -64.0f, 64.3f)
                horizontalLineTo(326.4f)
                lineTo(288.0f, 448.0f)
                lineToRelative(80.8f, -67.3f)
                curveToRelative(7.8f, -6.5f, 7.6f, -18.6f, -0.4f, -24.9f)
                lineTo(250.6f, 263.2f)
                curveToRelative(-14.6f, -11.5f, -33.8f, 7.0f, -22.8f, 22.0f)
                lineTo(288.0f, 368.0f)
                lineToRelative(-85.5f, 71.2f)
                curveToRelative(-6.1f, 5.0f, -7.5f, 13.8f, -3.5f, 20.5f)
                lineTo(230.4f, 512.0f)
                horizontalLineTo(128.1f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(287.6f)
                horizontalLineTo(32.0f)
                curveToRelative(-18.0f, 0.0f, -32.0f, -14.0f, -32.0f, -32.1f)
                curveToRelative(0.0f, -9.0f, 3.0f, -17.0f, 10.0f, -24.0f)
                lineTo(266.4f, 8.0f)
                curveToRelative(7.0f, -7.0f, 15.0f, -8.0f, 22.0f, -8.0f)
                reflectiveCurveToRelative(15.0f, 2.0f, 21.0f, 7.0f)
                lineTo(416.0f, 100.7f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(185.0f)
                lineToRelative(52.8f, 46.4f)
                curveToRelative(8.0f, 7.0f, 12.0f, 15.0f, 11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _houseChimneyCrack!!
    }

private var _houseChimneyCrack: ImageVector? = null
