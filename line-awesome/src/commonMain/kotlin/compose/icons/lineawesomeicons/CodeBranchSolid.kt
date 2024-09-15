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

public val LineAwesomeIcons.CodeBranchSolid: ImageVector
    get() {
        if (_codeBranchSolid != null) {
            return _codeBranchSolid!!
        }
        _codeBranchSolid = Builder(name = "CodeBranchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                curveTo(9.355f, 4.0f, 8.0f, 5.355f, 8.0f, 7.0f)
                curveTo(8.0f, 8.293f, 8.844f, 9.395f, 10.0f, 9.813f)
                lineTo(10.0f, 22.188f)
                curveTo(8.844f, 22.605f, 8.0f, 23.707f, 8.0f, 25.0f)
                curveTo(8.0f, 26.645f, 9.355f, 28.0f, 11.0f, 28.0f)
                curveTo(12.645f, 28.0f, 14.0f, 26.645f, 14.0f, 25.0f)
                curveTo(14.0f, 23.73f, 13.184f, 22.656f, 12.063f, 22.219f)
                curveTo(12.207f, 20.988f, 12.684f, 20.383f, 13.438f, 19.875f)
                curveTo(14.336f, 19.27f, 15.715f, 18.91f, 17.219f, 18.563f)
                curveTo(18.723f, 18.215f, 20.336f, 17.855f, 21.688f, 16.906f)
                curveTo(22.875f, 16.074f, 23.773f, 14.711f, 23.969f, 12.813f)
                curveTo(25.141f, 12.402f, 26.0f, 11.301f, 26.0f, 10.0f)
                curveTo(26.0f, 8.355f, 24.645f, 7.0f, 23.0f, 7.0f)
                curveTo(21.355f, 7.0f, 20.0f, 8.355f, 20.0f, 10.0f)
                curveTo(20.0f, 11.277f, 20.832f, 12.352f, 21.969f, 12.781f)
                curveTo(21.832f, 14.094f, 21.324f, 14.746f, 20.563f, 15.281f)
                curveTo(19.664f, 15.91f, 18.277f, 16.281f, 16.781f, 16.625f)
                curveTo(15.285f, 16.969f, 13.664f, 17.273f, 12.313f, 18.188f)
                curveTo(12.203f, 18.262f, 12.102f, 18.355f, 12.0f, 18.438f)
                lineTo(12.0f, 9.813f)
                curveTo(13.156f, 9.395f, 14.0f, 8.293f, 14.0f, 7.0f)
                curveTo(14.0f, 5.355f, 12.645f, 4.0f, 11.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                curveTo(11.563f, 6.0f, 12.0f, 6.438f, 12.0f, 7.0f)
                curveTo(12.0f, 7.563f, 11.563f, 8.0f, 11.0f, 8.0f)
                curveTo(10.438f, 8.0f, 10.0f, 7.563f, 10.0f, 7.0f)
                curveTo(10.0f, 6.438f, 10.438f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(23.0f, 9.0f)
                curveTo(23.563f, 9.0f, 24.0f, 9.438f, 24.0f, 10.0f)
                curveTo(24.0f, 10.563f, 23.563f, 11.0f, 23.0f, 11.0f)
                curveTo(22.438f, 11.0f, 22.0f, 10.563f, 22.0f, 10.0f)
                curveTo(22.0f, 9.438f, 22.438f, 9.0f, 23.0f, 9.0f)
                close()
                moveTo(11.0f, 24.0f)
                curveTo(11.563f, 24.0f, 12.0f, 24.438f, 12.0f, 25.0f)
                curveTo(12.0f, 25.563f, 11.563f, 26.0f, 11.0f, 26.0f)
                curveTo(10.438f, 26.0f, 10.0f, 25.563f, 10.0f, 25.0f)
                curveTo(10.0f, 24.438f, 10.438f, 24.0f, 11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _codeBranchSolid!!
    }

private var _codeBranchSolid: ImageVector? = null
