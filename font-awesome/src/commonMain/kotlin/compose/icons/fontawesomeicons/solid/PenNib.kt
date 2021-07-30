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

public val SolidGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.6f, 138.79f)
                arcToRelative(64.003f, 64.003f, 0.0f, false, false, -43.31f, 41.35f)
                lineTo(0.0f, 460.0f)
                lineToRelative(14.69f, 14.69f)
                lineTo(164.8f, 324.58f)
                curveToRelative(-2.99f, -6.26f, -4.8f, -13.18f, -4.8f, -20.58f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-7.4f, 0.0f, -14.32f, -1.81f, -20.58f, -4.8f)
                lineTo(37.31f, 497.31f)
                lineTo(52.0f, 512.0f)
                lineToRelative(279.86f, -93.29f)
                arcToRelative(64.003f, 64.003f, 0.0f, false, false, 41.35f, -43.31f)
                lineTo(416.0f, 224.0f)
                lineTo(288.0f, 96.0f)
                lineToRelative(-151.4f, 42.79f)
                close()
                moveTo(497.94f, 74.17f)
                lineToRelative(-60.11f, -60.11f)
                curveToRelative(-18.75f, -18.75f, -49.16f, -18.75f, -67.91f, 0.0f)
                lineToRelative(-56.55f, 56.55f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(56.55f, -56.55f)
                curveToRelative(18.75f, -18.75f, 18.75f, -49.15f, 0.0f, -67.91f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
