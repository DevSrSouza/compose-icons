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

public val SolidGroup.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = Builder(name = "DoorOpen", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 448.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineTo(113.45f)
                curveTo(544.0f, 86.19f, 522.47f, 64.0f, 496.0f, 64.0f)
                horizontalLineTo(384.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(384.0f)
                horizontalLineToRelative(144.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(312.24f, 1.01f)
                lineToRelative(-192.0f, 49.74f)
                curveTo(105.99f, 54.44f, 96.0f, 67.7f, 96.0f, 82.92f)
                verticalLineTo(448.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(336.0f)
                verticalLineTo(33.18f)
                curveToRelative(0.0f, -21.58f, -19.56f, -37.41f, -39.76f, -32.17f)
                close()
                moveTo(264.0f, 288.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -14.33f, -24.0f, -32.0f)
                reflectiveCurveToRelative(10.75f, -32.0f, 24.0f, -32.0f)
                reflectiveCurveToRelative(24.0f, 14.33f, 24.0f, 32.0f)
                reflectiveCurveToRelative(-10.75f, 32.0f, -24.0f, 32.0f)
                close()
            }
        }
        .build()
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
