package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BalanceScaleLeftSolid: ImageVector
    get() {
        if (_balanceScaleLeftSolid != null) {
            return _balanceScaleLeftSolid!!
        }
        _balanceScaleLeftSolid = Builder(name = "BalanceScaleLeftSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.523f, 5.109f)
                lineTo(18.281f, 7.076f)
                curveTo(17.73f, 6.424f, 16.918f, 6.0f, 16.0f, 6.0f)
                curveTo(14.346f, 6.0f, 13.0f, 7.346f, 13.0f, 9.0f)
                curveTo(13.0f, 9.021f, 13.005f, 9.041f, 13.006f, 9.063f)
                lineTo(8.0f, 11.0f)
                lineTo(3.0f, 19.75f)
                lineTo(3.0f, 20.016f)
                curveTo(3.0f, 22.772f, 5.243f, 25.0f, 8.0f, 25.0f)
                curveTo(10.757f, 25.0f, 13.0f, 22.772f, 13.0f, 20.016f)
                lineTo(13.0f, 19.75f)
                lineTo(9.01f, 12.766f)
                lineTo(13.725f, 10.932f)
                curveTo(14.063f, 11.33f, 14.498f, 11.637f, 15.0f, 11.816f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(21.0f, 26.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 11.816f)
                curveTo(18.161f, 11.402f, 19.0f, 10.302f, 19.0f, 9.0f)
                curveTo(19.0f, 8.981f, 18.994f, 8.964f, 18.994f, 8.945f)
                lineTo(23.211f, 7.363f)
                lineTo(19.0f, 14.734f)
                lineTo(19.0f, 15.0f)
                curveTo(19.0f, 17.757f, 21.243f, 20.0f, 24.0f, 20.0f)
                curveTo(26.757f, 20.0f, 29.0f, 17.757f, 29.0f, 15.0f)
                lineTo(29.0f, 14.734f)
                lineTo(24.51f, 6.877f)
                lineTo(23.523f, 5.109f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(16.552f, 8.0f, 17.0f, 8.449f, 17.0f, 9.0f)
                curveTo(17.0f, 9.551f, 16.552f, 10.0f, 16.0f, 10.0f)
                curveTo(15.448f, 10.0f, 15.0f, 9.551f, 15.0f, 9.0f)
                curveTo(15.0f, 8.449f, 15.448f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(24.0f, 10.016f)
                lineTo(26.277f, 14.0f)
                lineTo(21.723f, 14.0f)
                lineTo(24.0f, 10.016f)
                close()
                moveTo(8.0f, 15.031f)
                lineTo(10.268f, 19.0f)
                lineTo(5.732f, 19.0f)
                lineTo(8.0f, 15.031f)
                close()
                moveTo(21.186f, 16.0f)
                lineTo(26.814f, 16.0f)
                curveTo(26.4f, 17.162f, 25.302f, 18.0f, 24.0f, 18.0f)
                curveTo(22.698f, 18.0f, 21.6f, 17.162f, 21.186f, 16.0f)
                close()
                moveTo(5.18f, 21.0f)
                lineTo(10.82f, 21.0f)
                curveTo(10.41f, 22.169f, 9.307f, 23.016f, 8.0f, 23.016f)
                curveTo(6.693f, 23.016f, 5.59f, 22.169f, 5.18f, 21.0f)
                close()
            }
        }
        .build()
        return _balanceScaleLeftSolid!!
    }

private var _balanceScaleLeftSolid: ImageVector? = null
