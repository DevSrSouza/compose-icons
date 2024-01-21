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

public val SolidGroup.HouseChimney: ImageVector
    get() {
        if (_houseChimney != null) {
            return _houseChimney!!
        }
        _houseChimney = Builder(name = "HouseChimney", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(543.8f, 287.6f)
                curveToRelative(17.0f, 0.0f, 32.0f, -14.0f, 32.0f, -32.1f)
                curveToRelative(1.0f, -9.0f, -3.0f, -17.0f, -11.0f, -24.0f)
                lineTo(512.0f, 185.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(36.7f)
                lineTo(309.5f, 7.0f)
                curveToRelative(-6.0f, -5.0f, -14.0f, -7.0f, -21.0f, -7.0f)
                reflectiveCurveToRelative(-15.0f, 1.0f, -22.0f, 8.0f)
                lineTo(10.0f, 231.5f)
                curveToRelative(-7.0f, 7.0f, -10.0f, 15.0f, -10.0f, 24.0f)
                curveToRelative(0.0f, 18.0f, 14.0f, 32.1f, 32.0f, 32.1f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(69.7f)
                curveToRelative(-0.1f, 0.9f, -0.1f, 1.8f, -0.1f, 2.8f)
                verticalLineTo(472.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.2f, 0.0f, 2.4f, -0.1f, 3.6f, -0.2f)
                curveToRelative(1.5f, 0.1f, 3.0f, 0.2f, 4.5f, 0.2f)
                horizontalLineTo(160.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                verticalLineTo(448.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                horizontalLineToRelative(24.0f)
                horizontalLineToRelative(32.5f)
                curveToRelative(1.4f, 0.0f, 2.8f, 0.0f, 4.2f, -0.1f)
                curveToRelative(1.1f, 0.1f, 2.2f, 0.1f, 3.3f, 0.1f)
                horizontalLineToRelative(16.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                verticalLineTo(455.8f)
                curveToRelative(0.3f, -2.6f, 0.5f, -5.3f, 0.5f, -8.1f)
                lineToRelative(-0.7f, -160.2f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _houseChimney!!
    }

private var _houseChimney: ImageVector? = null
