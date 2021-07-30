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

public val SolidGroup.HouseUser: ImageVector
    get() {
        if (_houseUser != null) {
            return _houseUser!!
        }
        _houseUser = Builder(name = "HouseUser", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(570.69f, 236.27f)
                lineTo(512.0f, 184.44f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(99.67f)
                lineTo(314.78f, 10.3f)
                curveTo(308.5f, 4.61f, 296.53f, 0.0f, 288.0f, 0.0f)
                reflectiveCurveToRelative(-20.46f, 4.61f, -26.74f, 10.3f)
                lineToRelative(-256.0f, 226.0f)
                arcTo(18.27f, 18.27f, 0.0f, false, false, 0.0f, 248.2f)
                arcToRelative(18.64f, 18.64f, 0.0f, false, false, 4.09f, 10.71f)
                lineTo(25.5f, 282.7f)
                arcToRelative(21.14f, 21.14f, 0.0f, false, false, 12.0f, 5.3f)
                arcToRelative(21.67f, 21.67f, 0.0f, false, false, 10.69f, -4.11f)
                lineToRelative(15.9f, -14.0f)
                verticalLineTo(480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(269.88f)
                lineToRelative(15.91f, 14.0f)
                arcTo(21.94f, 21.94f, 0.0f, false, false, 538.63f, 288.0f)
                arcToRelative(20.89f, 20.89f, 0.0f, false, false, 11.87f, -5.31f)
                lineToRelative(21.41f, -23.81f)
                arcTo(21.64f, 21.64f, 0.0f, false, false, 576.0f, 248.19f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 570.69f, 236.27f)
                close()
                moveTo(288.0f, 176.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -64.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 288.0f, 176.0f)
                close()
                moveTo(400.0f, 448.0f)
                horizontalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 96.0f, -96.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 96.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 400.0f, 448.0f)
                close()
            }
        }
        .build()
        return _houseUser!!
    }

private var _houseUser: ImageVector? = null
