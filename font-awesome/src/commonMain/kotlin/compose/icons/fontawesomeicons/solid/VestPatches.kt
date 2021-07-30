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

public val SolidGroup.VestPatches: ImageVector
    get() {
        if (_vestPatches != null) {
            return _vestPatches!!
        }
        _vestPatches = Builder(name = "VestPatches", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(437.252f, 239.877f)
                lineTo(384.0f, 160.0f)
                verticalLineTo(32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 352.0f, 0.0f)
                horizontalLineTo(320.0f)
                arcToRelative(23.982f, 23.982f, 0.0f, false, false, -13.312f, 4.031f)
                lineToRelative(-25.0f, 16.672f)
                arcToRelative(103.794f, 103.794f, 0.0f, false, true, -115.376f, 0.0f)
                lineToRelative(-25.0f, -16.672f)
                arcTo(23.982f, 23.982f, 0.0f, false, false, 128.0f, 0.0f)
                horizontalLineTo(96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 32.0f)
                verticalLineTo(160.0f)
                lineTo(10.748f, 239.877f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 275.377f)
                verticalLineTo(480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(288.0f)
                arcToRelative(31.987f, 31.987f, 0.0f, false, true, 1.643f, -10.119f)
                lineTo(207.135f, 237.4f)
                lineTo(150.188f, 66.561f)
                arcTo(151.579f, 151.579f, 0.0f, false, false, 224.0f, 86.234f)
                arcToRelative(151.565f, 151.565f, 0.0f, false, false, 73.811f, -19.668f)
                lineTo(224.0f, 288.0f)
                verticalLineTo(512.0f)
                horizontalLineTo(416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(275.377f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 437.252f, 239.877f)
                close()
                moveTo(63.5f, 272.484f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, 17.0f, -16.968f)
                lineToRelative(15.5f, 15.5f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, 17.0f, 16.968f)
                lineTo(112.984f, 288.0f)
                lineTo(128.5f, 303.516f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, -17.0f, 16.968f)
                lineTo(96.0f, 304.984f)
                lineToRelative(-15.5f, 15.5f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, -17.0f, -16.968f)
                lineTo(79.016f, 288.0f)
                close()
                moveTo(96.0f, 456.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 96.0f, 456.0f)
                close()
                moveTo(359.227f, 335.785f)
                lineTo(310.7f, 336.0f)
                arcToRelative(6.671f, 6.671f, 0.0f, false, true, -6.7f, -6.7f)
                lineToRelative(0.215f, -48.574f)
                arcTo(24.987f, 24.987f, 0.0f, false, true, 331.43f, 256.1f)
                curveToRelative(12.789f, 1.162f, 22.129f, 12.619f, 22.056f, 25.419f)
                lineToRelative(-0.037f, 5.057f)
                lineToRelative(5.051f, -0.037f)
                curveToRelative(12.826f, -0.035f, 24.236f, 9.275f, 25.4f, 22.076f)
                arcTo(24.948f, 24.948f, 0.0f, false, true, 359.227f, 335.785f)
                close()
            }
        }
        .build()
        return _vestPatches!!
    }

private var _vestPatches: ImageVector? = null
