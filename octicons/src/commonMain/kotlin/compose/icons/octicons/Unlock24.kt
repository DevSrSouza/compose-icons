package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unlock24: ImageVector
    get() {
        if (_unlock24 != null) {
            return _unlock24!!
        }
        _unlock24 = Builder(name = "Unlock24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 7.25f)
                curveTo(7.5f, 4.58f, 9.422f, 2.5f, 12.0f, 2.5f)
                curveToRelative(2.079f, 0.0f, 3.71f, 1.34f, 4.282f, 3.242f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.436f, -0.432f)
                curveTo(16.971f, 2.825f, 14.792f, 1.0f, 12.0f, 1.0f)
                curveTo(8.503f, 1.0f, 6.0f, 3.845f, 6.0f, 7.25f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 11.5f)
                verticalLineToRelative(8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 22.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 9.0f)
                horizontalLineToRelative(-11.0f)
                lineTo(7.5f, 7.25f)
                close()
                moveTo(4.5f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _unlock24!!
    }

private var _unlock24: ImageVector? = null
