package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BilibiliFill: ImageVector
    get() {
        if (_bilibiliFill != null) {
            return _bilibiliFill!!
        }
        _bilibiliFill = Builder(name = "BilibiliFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.223f, 3.086f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 1.768f)
                lineTo(17.08f, 5.996f)
                horizontalLineToRelative(1.17f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 22.0f, 9.747f)
                verticalLineToRelative(7.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.75f, 3.75f)
                lineTo(5.75f, 20.997f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 2.0f, 17.247f)
                verticalLineToRelative(-7.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 3.75f, -3.75f)
                horizontalLineToRelative(1.166f)
                lineTo(5.775f, 4.855f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 1.767f, -1.768f)
                lineToRelative(2.652f, 2.652f)
                curveToRelative(0.079f, 0.079f, 0.145f, 0.165f, 0.198f, 0.257f)
                horizontalLineToRelative(3.213f)
                curveToRelative(0.053f, -0.092f, 0.12f, -0.18f, 0.199f, -0.258f)
                lineToRelative(2.651f, -2.652f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 1.768f, 0.0f)
                close()
                moveTo(18.25f, 8.506f)
                lineTo(5.75f, 8.506f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.247f, 1.157f)
                lineToRelative(-0.003f, 0.094f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.659f, 0.51f, 1.199f, 1.157f, 1.246f)
                lineToRelative(0.093f, 0.004f)
                horizontalLineToRelative(12.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.247f, -1.157f)
                lineToRelative(0.003f, -0.093f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveTo(8.25f, 11.006f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                close()
                moveTo(15.75f, 11.006f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                close()
            }
        }
        .build()
        return _bilibiliFill!!
    }

private var _bilibiliFill: ImageVector? = null
