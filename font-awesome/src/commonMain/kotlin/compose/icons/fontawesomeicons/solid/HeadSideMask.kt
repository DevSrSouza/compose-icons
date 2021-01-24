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

public val SolidGroup.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.15f, 184.42f)
                curveTo(-2.17f, 244.21f, 23.0f, 298.06f, 64.0f, 334.88f)
                lineTo(64.0f, 512.0f)
                lineTo(224.0f, 512.0f)
                lineTo(224.0f, 316.51f)
                lineTo(3.67f, 156.25f)
                arcTo(182.28f, 182.28f, 0.0f, false, false, 0.15f, 184.42f)
                close()
                moveTo(509.22f, 275.0f)
                curveToRelative(-21.0f, -47.12f, -48.5f, -151.75f, -73.12f, -186.75f)
                arcTo(208.11f, 208.11f, 0.0f, false, false, 266.11f, 0.0f)
                lineTo(200.0f, 0.0f)
                curveTo(117.0f, 0.0f, 42.48f, 50.57f, 13.25f, 123.65f)
                lineTo(239.21f, 288.0f)
                lineTo(511.76f, 288.0f)
                arcTo(31.35f, 31.35f, 0.0f, false, false, 509.22f, 275.0f)
                close()
                moveTo(320.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.07f, 32.07f, 0.0f, false, true, 320.0f, 224.0f)
                close()
                moveTo(336.0f, 368.0f)
                lineTo(496.0f, 368.0f)
                lineToRelative(16.0f, -48.0f)
                lineTo(256.0f, 320.0f)
                lineTo(256.0f, 512.0f)
                lineTo(401.88f, 512.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 60.71f, -43.76f)
                lineTo(464.0f, 464.0f)
                lineTo(336.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(474.67f, 432.0f)
                lineToRelative(10.67f, -32.0f)
                lineTo(336.0f, 400.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
