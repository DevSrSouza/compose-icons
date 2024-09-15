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
                moveTo(437.25f, 239.88f)
                lineTo(384.0f, 160.0f)
                verticalLineTo(32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 352.0f, 0.0f)
                horizontalLineTo(320.0f)
                arcToRelative(23.98f, 23.98f, 0.0f, false, false, -13.31f, 4.03f)
                lineToRelative(-25.0f, 16.67f)
                arcToRelative(103.79f, 103.79f, 0.0f, false, true, -115.38f, 0.0f)
                lineToRelative(-25.0f, -16.67f)
                arcTo(23.98f, 23.98f, 0.0f, false, false, 128.0f, 0.0f)
                horizontalLineTo(96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 32.0f)
                verticalLineTo(160.0f)
                lineTo(10.75f, 239.88f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 0.0f, 275.38f)
                verticalLineTo(480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(288.0f)
                arcToRelative(31.99f, 31.99f, 0.0f, false, true, 1.64f, -10.12f)
                lineTo(207.13f, 237.4f)
                lineTo(150.19f, 66.56f)
                arcTo(151.58f, 151.58f, 0.0f, false, false, 224.0f, 86.23f)
                arcToRelative(151.57f, 151.57f, 0.0f, false, false, 73.81f, -19.67f)
                lineTo(224.0f, 288.0f)
                verticalLineTo(512.0f)
                horizontalLineTo(416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(275.38f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 437.25f, 239.88f)
                close()
                moveTo(63.5f, 272.48f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, 17.0f, -16.97f)
                lineToRelative(15.5f, 15.5f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, 17.0f, 16.97f)
                lineTo(112.98f, 288.0f)
                lineTo(128.5f, 303.52f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, -17.0f, 16.97f)
                lineTo(96.0f, 304.98f)
                lineToRelative(-15.5f, 15.5f)
                arcToRelative(12.01f, 12.01f, 0.0f, false, true, -17.0f, -16.97f)
                lineTo(79.02f, 288.0f)
                close()
                moveTo(96.0f, 456.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 96.0f, 456.0f)
                close()
                moveTo(359.23f, 335.79f)
                lineTo(310.7f, 336.0f)
                arcToRelative(6.67f, 6.67f, 0.0f, false, true, -6.7f, -6.7f)
                lineToRelative(0.22f, -48.57f)
                arcTo(24.99f, 24.99f, 0.0f, false, true, 331.43f, 256.1f)
                curveToRelative(12.79f, 1.16f, 22.13f, 12.62f, 22.06f, 25.42f)
                lineToRelative(-0.04f, 5.06f)
                lineToRelative(5.05f, -0.04f)
                curveToRelative(12.83f, -0.04f, 24.24f, 9.27f, 25.4f, 22.08f)
                arcTo(24.95f, 24.95f, 0.0f, false, true, 359.23f, 335.79f)
                close()
            }
        }
        .build()
        return _vestPatches!!
    }

private var _vestPatches: ImageVector? = null
